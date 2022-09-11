package com.BikkadIT.UserManagementApplication.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean sendMail(String to,String subject,String body)  {
	
		boolean isSent=false;
		
		MimeMessage mimeMessage= javaMailSender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
		try {
			helper.setTo(to);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			helper.setSubject(subject);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			helper.setText(body,true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		javaMailSender.send(mimeMessage);
		isSent=true;
		return isSent;
		
	}
	
}
