# Spring Boot CRUD Application

Ce projet montre comment creer une application CRUD (Create, Read, Update, Delete) utilisant Spring Boot, Postgres et Spring Data JPA.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Postman Collection](#postman-collection)
- [Technologies Used](#technologies-used)

## Prerequisites

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

The following endpoints are available for the CRUD operations on the `Person` entity:

- **GET /api/persons**
    - Retrieve a list of all persons.

- **GET /api/persons/{id}**
    - Retrieve a single person by ID.

- **POST /api/persons**
    - Create a new person.
    - Example request body:
      ```json
      {
          "name": "John Doe",
          "city": "Los Angeles",
          "phoneNumber" : "999-777-444"
      }
      ```

- **PUT /api/persons/{id}**
    - Update an existing person by ID.
    - Example request body:
      ```json
      {
          "city": "New York",
          "phoneNumber" : "999-777-444"
      }
      ```

- **DELETE /api/persons/{id}**
    - Delete a person by ID.

## Postman Collection

A Postman collection to test each endpoint is included at the root of the project folder. You can import this collection into Postman to quickly test the API.

## Technologies Used

- **Spring Boot:** A framework to simplify the bootstrapping and development of new Spring applications.
- **Spring Data JPA:** A part of the larger Spring Data family to easily implement JPA-based repositories.
- **MySQL:** A relational database management system.
- **Maven:** A build automation tool used primarily for Java projects.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or suggestions.


---

Happy coding!
