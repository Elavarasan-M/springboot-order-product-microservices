# Spring Boot Order Product Microservices

A Spring Boot Microservices project demonstrating **service-to-service communication** using **RestTemplate**. The project consists of two independent microservices: **Product Service** and **Order Service**.

---

## 🚀 Features

* Product Management
* Order Management
* Service-to-Service Communication
* RESTful APIs
* CRUD Operations
* Layered Architecture
* DTO-Based Request & Response
* Spring Data JPA
* Database Integration

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* RestTemplate
* Maven
* H2 Database / MySQL

---

## 📁 Project Structure

```text
springboot-order-product-microservices
│
├── product-service
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   └── resources
│
├── order-service
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   ├── config
│   └── resources
│
└── README.md
```

---

## 📦 Product Service

### Responsibilities

* Create Product
* Retrieve All Products
* Retrieve Product by ID
* Update Product
* Delete Product

---

## 📋 Order Service

### Responsibilities

* Create Order
* Retrieve All Orders
* Retrieve Order by ID
* Update Order
* Delete Order
* Retrieve Product Details from Product Service

---

## 🔄 Service Communication

| Source Service | Destination Service | Communication |
| -------------- | ------------------- | ------------- |
| Order Service  | Product Service     | RestTemplate  |

---

## 📡 REST APIs

### Product Service

| Method | Endpoint                | Description            |
| ------ | ----------------------- | ---------------------- |
| POST   | `/api/v1/products`      | Create Product         |
| GET    | `/api/v1/products`      | Retrieve All Products  |
| GET    | `/api/v1/products/{id}` | Retrieve Product by ID |
| PUT    | `/api/v1/products/{id}` | Update Product         |
| DELETE | `/api/v1/products/{id}` | Delete Product         |

### Order Service

| Method | Endpoint              | Description          |
| ------ | --------------------- | -------------------- |
| POST   | `/api/v1/orders`      | Create Order         |
| GET    | `/api/v1/orders`      | Retrieve All Orders  |
| GET    | `/api/v1/orders/{id}` | Retrieve Order by ID |
| PUT    | `/api/v1/orders/{id}` | Update Order         |
| DELETE | `/api/v1/orders/{id}` | Delete Order         |

---

## 🎯 Learning Objectives

* Spring Boot Microservices
* RESTful API Development
* CRUD Operations
* Layered Architecture
* Service-to-Service Communication
* RestTemplate Configuration
* Dependency Injection
* Spring Data JPA
* DTO Pattern
* Maven Project Structure

---

## 🔮 Future Enhancements

* Spring WebClient
* OpenFeign Client
* API Gateway
* Service Discovery (Eureka)
* Config Server
* Resilience4j
* Docker & Docker Compose
* Swagger / OpenAPI
* Unit & Integration Testing

---

## 👨‍💻 Author

**Elavarasan M**
