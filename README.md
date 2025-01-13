# Comic Creation API

## Overview

The Comic Creation API is a microservice designed to manage the creation and editing of AI-generated comics. This API allows users to perform CRUD (Create, Read, Update, Delete) operations on comic resources. It is built using Java Spring Boot and follows the OpenAPI 3.0 specification.

### Purpose

The primary purpose of this microservice is to provide a robust backend service for applications that require comic creation and management capabilities. It leverages AI to assist in generating comic content, making it easier for users to create and edit comics.

### Features

- **Get all comics**: Retrieve a list of all available comics.
- **Create a new comic**: Add a new comic to the collection.
- **Get a comic by ID**: Fetch details of a specific comic using its ID.
- **Update a comic by ID**: Modify the details of an existing comic.
- **Delete a comic by ID**: Remove a comic from the collection.

### Technical Details

- **API Version**: 1.0.0
- **Base Path**: `/comics`
- **Data Format**: JSON

## Build Instructions

### Spring Boot Application

To build and run the application, follow these steps:

1. Ensure you have Java 11 or higher installed.
2. Clone the repository to your local machine.
3. Navigate to the project directory.
4. Run the following command to build the project:
   ```bash
   mvn clean install
   ```
5. Once the build is successful, run the application using:
   ```bash
   java -jar target/comic-creation-api-1.0.0.jar
   ```

### Flyway DB Integration

To set up the database, follow these prerequisites:

1. Ensure Docker is installed and running on your machine.
2. Use the following script to create the database:
   ```sql
   CREATE DATABASE IF NOT EXISTS `comic_db`;
   ```
3. To avoid errors with reserved keywords, execute:
   ```sql
   SET sql_mode = 'ANSI_QUOTES';
   ```

## Running Locally

To run the application locally using Docker, follow these steps:

1. Ensure Docker and Docker Compose are installed on your machine.
2. Use the provided `docker-compose.yml` file to set up the environment.
3. The `docker-compose` file will:
   - Create a MySQL container.
   - Run `mvn clean install` to build the application and generate a `.jar` file.
   - Build the service image using the Dockerfile.
4. Execute the following command to start the services:
   ```bash
   docker-compose up
   ```
5. No pre-existing MySQL instance is required as the `docker-compose` will handle the database setup.

## Conclusion

This README provides a comprehensive guide to setting up and running the Comic Creation API. For further details, refer to the OpenAPI specification included in the project.