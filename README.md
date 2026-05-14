# Task Manager API

Backend REST API built with Spring Boot for managing tasks.

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Features (planned)
- User authentication (JWT)
- Task CRUD operations
- Task status management
- Filtering & pagination

## How to run
1. Clone the repository
2. Run the application
3. Access: http://localhost:8080

## API Endpoints

### Create Task
POST /api/tasks

### Get All Tasks
GET /api/tasks

## Improvements
- DTO pattern for request/response separation
- Input validation using Jakarta Validation

## Error Handling
- Global exception handling using `@RestControllerAdvice`
- Custom exception responses with proper HTTP status codes