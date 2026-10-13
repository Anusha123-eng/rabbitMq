# RabbitMQ with Spring Boot

## Project Overview
This project demonstrates how to integrate RabbitMQ with Spring Boot to implement asynchronous message communication between applications.

RabbitMQ is a message broker that receives, stores, and delivers messages between producers and consumers. Spring Boot simplifies RabbitMQ integration using Spring AMQP.

## Technologies Used
- Java
- Spring Boot
- RabbitMQ
- Spring AMQP
- Maven
- REST API
- Docker

## Key Features
- Send messages using a REST API.
- Publish messages to RabbitMQ exchanges.
- Route messages to queues using routing keys.
- Consume messages from RabbitMQ queues.
- Configure queues, exchanges, and bindings.
- Support asynchronous communication between applications.
- Use Docker to run RabbitMQ locally.

## Project Workflow
1. The client sends a request to the Spring Boot REST API.
2. The producer sends the message to RabbitMQ.
3. RabbitMQ routes the message to the appropriate queue.
4. The consumer receives and processes the message.

## How to Run the Project
1. Start RabbitMQ using Docker.
2. Configure the RabbitMQ connection properties in Spring Boot.
3. Run the Spring Boot application.
4. Send a request to the REST API to publish a message.
5. Verify that the consumer receives the message.

## Learning Outcomes
- Understanding message queues and asynchronous communication.
- Integrating RabbitMQ with Spring Boot.
- Working with producers, consumers, exchanges, queues, and routing keys.
- Using Docker to run RabbitMQ locally.
