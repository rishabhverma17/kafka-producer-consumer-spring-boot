# Kafka producer-consumer example using springboot microservices
**This is just a working template of producing and consuming message in Spring Boot using Kafka**

## Kafka Producer

### How to produce messages?
- http://localhost:9090/v1/publish/yourName

### Kafka topic 
- kafka-spring-producer

## Kafka Consumer 

### How to produce messages?
- Just run the application and start producing messages, It will show up in console.

### Kafka topic 
- kafka-spring-producer

## Requirements to run the template
- Zookeeper
- Kafka

_**TODO** : This is just a template project to get up and running, So here we have hardcoded the topics and port in java class, You should use application config for injecting these values._
