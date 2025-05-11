# Auth Service – School Vaccination Portal

This Spring Boot service handles authentication for the School Vaccination Portal system. It provides a simulated login and issues JWT tokens to enable secure, stateless access to protected backend APIs.

---

## Features

- Simulated login using hardcoded admin credentials
- JWT token generation
- Stateless authentication via Spring Security
- Integrates easily with other services via token-based headers
- Docker + Kubernetes deployable

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JSON Web Token (JWT using `jjwt`)
- Maven
- Docker
- Kubernetes (Minikube for local deployment)

---

## API Overview

### Login Endpoint

| Method | Endpoint     | Description                |
|--------|--------------|----------------------------|
| POST   | `/auth/login`| Authenticate and get token |

#### Sample Request

```json
{
  "username": "admin",
  "password": "admin"
}
