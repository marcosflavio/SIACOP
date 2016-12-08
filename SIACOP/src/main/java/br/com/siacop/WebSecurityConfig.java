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
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth_psicologa, AuthenticationManagerBuilder auth_usuario) throws Exception {
		
	//Psicologa
	  auth_psicologa.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
			"select login,senha,1 from psicologa where login=?")
		.authoritiesByUsernameQuery(
			"select login,papel from psicologa where login=?");
	  
	  auth_usuario.jdbcAuthentication().dataSource(dataSource)
	  .usersByUsernameQuery(
			"select login,senha,1 from usuario where login=?")
	  .authoritiesByUsernameQuery(
			"select login,'ROLE_USER' from usuario where login=?");
	  
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	 http.csrf().disable();
	 http
		 .authorizeRequests()
		 .antMatchers("/**").permitAll()
		 .antMatchers("/css/**","/font-awesome/**","/fonts/**", "/js/**","/img/**","/fullcalendar3/**", "/public/**").permitAll()
         .and()
     .formLogin()
         .loginPage("/login").failureUrl("/login?error").defaultSuccessUrl("/index",true)
         .usernameParameter("username").passwordParameter("password")
         .permitAll()
         .and()
     .logout().logoutSuccessUrl("/login?logout");
	 
       
	}
	
}
