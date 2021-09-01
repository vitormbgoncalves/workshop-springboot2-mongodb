# 🍃 Workshop Spring Boot 2 with MongoDB

## 🚀 About this project

This project was developed based on Udemy's course [*__Java COMPLETO Programação Orientada a Objetos + Projetos__*](https://www.udemy.com/course/java-curso-completo/), taught by the teacher [Nelio Alves](https://github.com/acenelio).
The objective of this project was to study the concepts of the Spring Boot framework for the development of RESTful Web Services and NoSQL data persistence with MongoDB.
The code consists of Rest Web Services built with Spring Boot and Spring Data MongoDB. 

## 🧰 Tools

- [**JDK 11**](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) - Java language support development kit;
- [**Maven**](https://maven.apache.org/) - for project management and build tool;
- [**Spring Boot**](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - for creating web application;
- [**Spring Data MongoDB**](https://spring.io/projects/spring-data-mongodb) - to access database;
- [**MongoDB**](https://www.mongodb.com/) - for database;
- [**Postman**](https://www.postman.com/) - for API development testing;
- [**Heroku**](https://heroku.co) - for deployment and production testing.

## 💻 Running

1. Clone the git project through the terminal:

```shell
git clone https://github.com/vitormbgoncalves/workshop-springboot2-mongodb.git
cd workshop-springboot2-mongodb
```

2. Then build the application with the command below:

```shell
mvn install
```

3. Now you are ready to lunch it:

```shell
mvn spring-boot:run
```

## 🗒 Quick note

To run this project it is necessary to have an instance of MongoDB running locally, and configure uri in: `src/main/resources/application.properties`

This project was developed and runs on Linux.
