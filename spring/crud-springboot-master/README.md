# Spring Boot CRUD Application

Ce projet montre comment creer une application CRUD (Create, Read, Update, Delete) utilisant Spring Boot, Postgres et Spring Data JPA.

## Table of Contents

- [Pre-requis](#pre-requis)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Postman Collection](#postman-collection)
- [Technologies Used](#technologies-used)

## Pre-requis

Before you begin, ensure you have the following installed on your machine:

- Java 8 ou +
- Maven
- Postgres
- Postman (facultatif, pour tester l'API)

## Setup

1. **Cloner le repo GITHUB:**

    ```sh
    git clone https://github.com/codingwitharmand/crud-springboot.git
    cd crud-springboot
    ```

2. **Configurer la connexion à la BDD:**

   Fichier `src/main/resources/application.properties` :

    ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
   spring.datasource.username=postgres
   spring.datasource.password=postgres
   spring.datasource.driver-class-name=org.postgresql.Driver
   spring.jpa.hibernate.ddl-auto=none
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```

3. **Build:**

    ```sh
    mvn clean install
    ```

## Lancer l'Application

1. **Lancer l'application:**

    ```sh
    ./mvn spring-boot:run
    ```

2. The application will start and run on `http://localhost:8080`.

## API Endpoints

Les endpoints disponibles pour les operation sur l'entité `Person` :

- **GET /api/persons**
    - Liste de toutes les personnes.

- **GET /api/persons/{id}**
    - Trouver une personne avec son ID.

- **POST /api/persons**
    - Creer une nouvelle personne.
    - Exemple "request body":
      ```json
      {
          "name": "John Doe",
          "city": "Los Angeles",
          "phoneNumber" : "999-777-444"
      }
      ```

- **PUT /api/persons/{id}**
    - Mettre a jour une personne existante avec son ID.
    - Exemple "request body":
      ```json
      {
          "city": "New York",
          "phoneNumber" : "999-777-444"
      }
      ```

- **DELETE /api/persons/{id}**
    - Supprimer une personne avec son ID.

## Postman

Une collection Postman présente à la racine du projet permet de tester chaque endpoint. Il est possible d'importer cette collection dans Postman pour rapidement tester l'API.

## Technologies Used

- **Spring Boot:** A framework to simplify the bootstrapping and development of new Spring applications.
- **Spring Data JPA:** A part of the larger Spring Data family to easily implement JPA-based repositories.
- **PostgreSQL:** A relational database management system.
- **Maven:** A build automation tool used primarily for Java projects.
