//package com.pruebaAmazon.pruebaMail.configuration;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
///import io.swagger.v3.oas.annotations.info.Info;
//import io.swagger.v3.oas.annotations.servers.Server;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * Configuracion de Swagger muestra informacion basica de la API, nombre acorde, descripcion y contacto  
 */
//@Configuration
//@EnableSwagger2
//@OpenAPIDefinition(servers = { @Server(url = "/ApiMailAWS") }, info = @Info(title = "ApiMailAWS", version = "v1", description = "API para el envio de correos electronicos usando AWS"))
//public class SwaggerConfig {

  //@Bean
//  public Docket api() {
    //return new Docket(DocumentationType.SWAGGER_2)
      //.select()
//      .apis(RequestHandlerSelectors.basePackage("com.pruebaAmazon.pruebaMail.controller"))
  //    .paths(PathSelectors.any())
    //  .build();
  //}
//}

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
