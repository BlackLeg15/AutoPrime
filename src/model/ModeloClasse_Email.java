package model;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import controller.alertas.Alertas;

public class Email {
	public static void emitirEmailCadastro(String email, String modalidade, String nomeAluno){
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication("suportescout@gmail.com", "@scout123");
					}
				});

		session.setDebug(true);

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("suportescout@gmail.com")); //Remetente

			Address[] toUser = InternetAddress.parse(email);

			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("AUXÃ�LIO "+modalidade.toUpperCase()+": CADASTRO REALIZADO COM SUCESSO!");//Assunto
			message.setText("OlÃ¡, "+nomeAluno+"!\n\nVocÃª foi cadastrado com sucesso no Programa de PermanÃªncia AcadÃªmica da UFERSA!\n\tDISCENTE: "+nomeAluno+"\n\tMODALIDADE: "+modalidade+"\nCaso esse email tenha chegado em sua caixa de mensagens por engano, por favor nos comunique o mais breve possÃ­vel!\n\nAtt.: AssistÃªncia Estudantil da UFERSA & Time Scout");

			Transport.send(message);

			System.out.println("Feito!!!");

		} catch (MessagingException e) {
			Alertas.mostraAlertaInfo("O e-mail nÃ£o Ã© reconhecido", "Verifique se o e-mail foi inserido corretamente e tente novamente");
		}
	}
	
	public static void emitirEmailSituacao(String email, String modalidade, String nomeAluno){
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(prop,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication("suportescout@gmail.com", "@scout123");
					}
				});

		session.setDebug(true);

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("suportescout@gmail.com")); //Remetente

			Address[] toUser = InternetAddress.parse(email);

			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("AUXÃ�LIO "+modalidade.toUpperCase()+": APROVADO");//Assunto
			message.setText("OlÃ¡, "+nomeAluno+"!\n\nSua inscriÃ§Ã£o no PermanÃªncia AcadÃªmica da UFERSA foi APROVADA!\n\tDISCENTE: "+nomeAluno+"\n\tMODALIDADE: "+modalidade+"\nProcure com urgÃªncia o setor de AssistÃªncia estudantil do campus urgentemente para mais detalhes sobre o local e data reuniÃ£o de posse.\n\nCaso esse email tenha chegado em sua caixa de mensagens por engano, por favor nos comunique o mais breve possÃ­vel!\n\nAtt.: AssistÃªncia Estudantil da UFERSA & Time Scout");

			Transport.send(message);

			System.out.println("Feito!!!");

		} catch (MessagingException e) {
			Alertas.mostraAlertaInfo("O e-mail nÃ£o Ã© reconhecido", "Verifique se o e-mail foi inserido corretamente e tente novamente");
		}
	}
}
