
package com.pruebaAmazon.pruebaMail.configuration;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
/*
 * Configuracion de Swagger muestra informacion basica de la API, nombre acorde, descripcion y contacto  
 */
@Configuration
@OpenAPIDefinition(servers = { @Server(url = "/ApiMailAWS") }, info = @Info(title = "ApiMailAWS", version = "v1", description = "API para el envio de correos electronicos usando AWS"))
public class SwaggerConfig {

}
