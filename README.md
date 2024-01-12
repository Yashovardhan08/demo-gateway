# Demo server

This repository contains the code for a demo server to test/demonstrate the usage of API gateway, Eureka Server and 
Authentication through Auth server using tokens.
## Technologies Used

- Spring Boot
- Spring Cloud Gateway

## Prerequisites

- Java

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/Yashovardhan08/demo.git
    cd demo-gateway
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```
    ```bash
    java -jar target/target-file-name.jar
    ```
The server should be running at http://localhost:8889(in application.properties) by default.


Additional changes should be incorporated through application.properties or Beans in spring boot.

