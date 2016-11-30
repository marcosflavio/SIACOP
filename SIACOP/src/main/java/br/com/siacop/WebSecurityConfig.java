package br.com.siacop;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	DataSource dataSource;
	
	//configuração de login 
	//verifica os dados contidos no banco
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

	  auth.inMemoryAuthentication().withUser("usuario").password("senha").roles("USER");
	  auth.inMemoryAuthentication().withUser("psicologa").password("senha").roles("PSICO");
	  //Geral
//	  auth.jdbcAuthentication().dataSource(dataSource)
//		.usersByUsernameQuery(
//			"select email,senha,1 from usuario where email=?")
//		.authoritiesByUsernameQuery(
//			"select usuario.email, usuario_funcao.funcao from usuario join usuario_funcao on usuario.idUsuario = usuario_funcao.idUsuario where usuario.email=?");
	  	//Query testada no SQL server 5.6
	  
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	 http.csrf().disable();
	 http
		 .authorizeRequests()
		 .antMatchers("/**").permitAll()
		 .antMatchers("/css/**", "/js/**","/img/**","/public/**").permitAll()
         .and()
     .formLogin()
         .loginPage("/login").failureUrl("/login?error").defaultSuccessUrl("/index",true)
         .usernameParameter("username").passwordParameter("password")
         .permitAll()
         .and()
     .logout().logoutSuccessUrl("/login?logout");
	 
       
	}
	
}
