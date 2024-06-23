# Project JDK17

## Table of Contents

- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
    - [OpenAPI Specification](#openapi-specification)
    - [Swagger UI](#swagger-ui)

## Getting Started

To get started with this project, clone the repository and follow the installation instructions below.

This project is a demonstration of a Spring Boot application using JDK 17 and Gradle 8.5, with Swagger UI enabled for API documentation.

## Features

- **Spring Boot 3.2.2**
- **JDK 17**
- **Gradle 8.5**
- **Swagger UI for API documentation**

## Dependencies

The key dependency added for enabling Swagger UI is:

```groovy
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0'
```

## API Documentation

Our API is documented using the OpenAPI specification. You can explore and test the endpoints interactively using Swagger UI.

### OpenAPI Specification

You can access the OpenAPI specification in JSON format using the following URL:
http://localhost:8080/v3/api-docs

### Swagger UI

Swagger UI provides an interactive interface to explore and test the API endpoints. Access it using the following URL:

http://localhost:8080/v3/api-docs

