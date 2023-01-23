package com.pruebaAmazon.pruebaMail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaAmazon.pruebaMail.service.MailService;

import io.swagger.v3.oas.annotations.Operation;

/**
 * "Responde a la interacción del usuario en la interfaz, y realiza las peticiones al modelo y devuelve el envio de email
 * 
 * @author Belen.Garcia
 *
 */

@RestController
@RequestMapping("/enviarMail")
public class MailController {

  /**
   * Inyeccion dependencia MailService
   */
  @Autowired
  private MailService mailService;

  /**
   * Gestiona creacion y envio de mail
   */
  @Operation(summary = "Envia un correo electronico estandar", tags = "Enviar correo")
  @GetMapping("/mailEstandar")
  void hello() {
    mailService.sendHello();
  }

  /**
   * Gestiona creacion plantilla HTML y envio de mail
   */
  @Operation(summary = "Genera plantilla HTML y la envia por correo", tags = "Enviar correo")
  @GetMapping("/plantillaHtml")
  void html() {
    mailService.sendHtml();
  }
  
}
