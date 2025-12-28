# Spring Boot Tareas API
API REST desarrollada con Spring Boot para la gestión de tareas.

## Tecnologías
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 / MySQL
- Maven
- Swagger / OpenAPI
- Angular 21

## Estructura del proyecto
src/
 └── main/
     ├── java/com/example/tareas
     │   ├── controller
     │   ├── service
     │   ├── repository
     │   └── model
     └── resources
         └── application.properties
## Configuración
### Base de datos (H2)
spring.datasource.url=jdbc:h2:file:./data/tareasdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=xx
spring.datasource.password=xx
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

## Ejecución
mvn spring-boot:run

## Urls
http://localhost:8080/
http://localhost:8080/swagger-ui.html


