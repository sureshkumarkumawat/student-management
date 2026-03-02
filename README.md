# 📚 Student Management REST API

A simple CRUD REST API built with **Spring Boot** and **MySQL**.

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.5
- MySQL 8.0
- JPA / Hibernate
- Lombok
- Maven

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/students | Create a student |
| GET    | /api/students | Get all students |
| GET    | /api/students/{id} | Get student by ID |
| PUT    | /api/students/{id} | Update a student |
| DELETE | /api/students/{id} | Delete a student |

## 🚀 How to Run

1. Clone the repo
2. Create MySQL database: CREATE DATABASE student_management;
3. Update application.properties with your MySQL credentials
4. Run: ./mvnw spring-boot:run

## 📄 License
This project is licensed under the MIT License.
