package com.pruebaAmazon.pruebaMail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

/**
 * "Esta clase contiene los metodos que seran llamados por el controlador para crear y enviar correos"
 * 
 * @author Belen.Garcia
 *
 */

@Service
public class MailService {
  private final String MY_EMAIL = "pruebaaws07@gmail.com";  // destinatario

  /**
   * Inyeccion de dependencia AmazonSimpleEmailServiceClient
   */
  @Autowired
  private AmazonSimpleEmailServiceClient client;

  /**
   * Inyeccion de dependencia TemplateEngine
   */
  @Autowired
  private TemplateEngine templateEngine;

  /**
   * Este metodo crea el email(remitente, destinatario, asunto y cuerpo de mensaje) y lo envía
   */
  public void sendHello() {
    
    Destination destination = new Destination().withToAddresses(MY_EMAIL); 

    Message message = new Message()
        .withSubject(new Content("Prueba email AWS")) // asunto
        .withBody(new Body(new Content("Hola, este un mensaje estandar enviado a traves de AWS"))); // cuerpo del correo

    SendEmailRequest emailRequest = new SendEmailRequest()
        .withSource(MY_EMAIL) // remitente
        .withDestination(destination).withMessage(message);
    client.sendEmail(emailRequest); // metodo para enviar email

  }
  
  /**
   * Este metodo crea una plantilla HTML(remitente, destinatario, asunto y cuerpo de mensaje) y envía el correo
   */
  public void sendHtml() {
    
    Destination destination = new Destination().withToAddresses(MY_EMAIL); // destinatario
    
    Context context = new Context();
    context.setVariable("name", "Belen");
    context.setVariable("domain", "https://github.com/BeluGarcia07");
    String html = templateEngine.process("hello", context);
    
    Content htmlContent = new Content().withData(html);
    Content textContent = new Content().withData("version en texto");
    Body body = new Body().withHtml(htmlContent).withText(textContent);
    
    Message message = new Message()
        .withSubject(new Content("Prueba email HTML AWS")) // asunto
        .withBody(body); // cuerpo del correo

    SendEmailRequest emailRequest = new SendEmailRequest()
        .withSource(MY_EMAIL) // remitente
        .withDestination(destination).withMessage(message);
    client.sendEmail(emailRequest); // metodo para enviar email
  }

}
