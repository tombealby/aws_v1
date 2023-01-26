The Content Distribution Service is a web application for displaying documents such as CVs and blogs. 

The application is built using Spring Boot version 2.7.7 with Thymeleaf for rendering the web pages. It has no database, and the java code is trivially simple. There is slightly more complication in the CSS, javascript code and the use of thymleaf templates to create re-usable HTML. 

Application Dependencies
- Java 11
- Maven

The application is built by executing the following command:

`mvn clean install`

The application can be run by executing the following command:

`mvn spring-boot:run`
