[![Captura.png](https://i.postimg.cc/cLbsWcDJ/Captura.png)](https://postimg.cc/tsF0tFG0)
# PruebaMail 

## Descripcion
PruebaMail es un administrador de correos electronicos que permite enviar mails usando AWS. Cuenta con un Servicio REST que permite elegir el envio de un correo estandar o una plantilla HTML.

## Ejecutar Localmente

Clonar el proyecto

```bash
  git clone https://gitlab.kolektor.com.ar/desarrollo-cba/CronAfipVE.git
```

Ir al directorio 

```bash
  cd pruebaMail
```

Instalar dependencias

```bash
  mvn clean install -U
```

Levantar el servidor

```bash
  mvn spring-boot:run
```

 Se puede acceder al servidor desde http://localhost:8080/ApiMailAWS, donde podemos llamar a los siguientes Endpoints.

### GET/Enviar correo  
	/"enviarMail/plantillaHTML"
		"Genera una plantilla HTML y la envia por Email"
    
### GET/Enviar correo  
	/"enviarMail/mailEstandar"
		""Genera una correo estandar y la envia por Email""
  Se puede utilizar el Servicio de Swagger en la URL http://localhost:8080/ApiMailAWS/swagger-ui/index.html

  [![ApiMail.png](https://i.postimg.cc/s20QZ4wL/ApiMail.png)](https://postimg.cc/sB7Dk7FP)

 Informacion de ApiMailAWS.   
   -Para ver la documentacion del proyecto: 
    pruebaMail/doc/index.html
   
   [![doc.png](https://i.postimg.cc/3x19VzxD/doc.png)](https://postimg.cc/SnXWzT8y)


## Author

- [@agarcia](https://gitlab.kolektor.com.ar/AGarcia)

## Tech Stack

**Lenguaje:** Java.

**Framework:** SpringBoot.

**Server:** Apache TomCat.

**Servicios:** AWS.


