package br.com.siacop.util;
//
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import br.com.siacop.model.Consulta;
import br.com.siacop.model.Usuario;

public class EmailUtil {
	public void sendConfirmMail(Usuario usuario, Consulta consulta) throws EmailException {
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.addTo(usuario.getEmail(), usuario.getNome());
		email.setFrom("siacop.quixada@gmail.com ", "Sistema de Acompanhamento de Consultas Psicológicas");
		email.setSubject("Confirmação de Consulta");
		email.setMsg("Olá caro usuário " + usuario.getNome() + " venho por meio deste, informar que sua "
				+ "consulta com a Psicóloga do campus foi confirmada para o dia " + consulta.getDataConsulta()
				+ " no turno da " + consulta.getPeriodoConsulta() + " às " + consulta.getHorario() +".\n\n\n\n"
				+ " Atenciosamente, \n" + "SIACOP Sistema de Acompanhamento de Consultas Psicológicas.\n\n\n" +
				"E-mail gerado automaticamente, favor não responder. \n\n\n");
		email.setSSL(true);
		email.setAuthentication("siacop.quixada@gmail.com", "federalquixadaufc");
		email.send();
	}
}
