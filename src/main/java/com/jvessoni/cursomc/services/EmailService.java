package com.jvessoni.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jvessoni.cursomc.domain.Cliente;
import com.jvessoni.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}