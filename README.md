# UserTaskManager API 📋

Este proyecto nació como parte de mi proceso de aprendizaje y consolidación en desarrollo backend con Spring Boot. Lo trabajé desde cero, estructurando todo manualmente y resolviendo errores técnicos con Maven, Git, VS Code y GitHub Desktop para lograr un proyecto limpio, versionado y funcional.

La API permite **registrar usuarios, iniciar sesión, gestionar tareas** y validar todos los datos de forma segura. También preparé el entorno para testeo, despliegue y documentación.

Esto es una réplica personalizada para practicar software. No es copy-paste, sino una forma de iterar sobre lo aprendido.
---

## 🚀 Tecnologías y herramientas

- **Java 17 + Spring Boot**
- **Spring Data JPA + PostgreSQL / H2**
- **Maven + Maven Wrapper**
- **Bean Validation (`javax.validation`)**
- **JUnit + MockMvc**
- **Docker + docker-compose**
- **GitHub Actions (CI/CD básico)**

---

## 🧩 Estructura base del repositorio

📁 UserTaskManager-API/ 
├── src/ │ 
├── main/ │ 
│ └── java/ 
│ │ └── com/adrieldobal/usertaskmanager/ 
│ │ ├── controller/ 
│ │ ├── service/ 
│ │ ├── model/ 
│ │ ├── dto/ 
│ │ ├── config/ 
│ │ └── exception/ 
│ ├── test/ │ 
│ └── java/com/adrieldobal/usertaskmanager/ 
│ │ ├── service/ 
│ │ └── controller/ 
├── application.yml 
├── Dockerfile 
├── docker-compose.yml 
└── .github/workflows/ci.yml


---

## 🔐 Validaciones y manejo de sesión

- Validaciones en los DTOs usando anotaciones como:  
  `@NotBlank`, `@Email`, `@Size`, `@Pattern`
- Captura de errores con `@ControllerAdvice`
- Manejo de sesión con token UUID (con opción a JWT más adelante)
- Respuestas personalizadas: `400 Bad Request`, `401 Unauthorized`, `404 Not Found`

---

## 🧪 Testing con JUnit + MockMvc

- Tests unitarios con `@MockBean`, `@InjectMocks`
- Tests de integración para endpoints
- Validación de respuestas, errores y status HTTP esperados

---

## 🐳 Docker + GitHub Actions

- Dockerfile preparado para correr en local y en producción
- docker-compose para PostgreSQL y API conectadas
- Workflow de CI:
  - Ejecuta tests en cada push
  - Compila el proyecto y genera imagen
  - *(Opcional)* Deploy en Render / Fly.io

---

## 🔗 Endpoints

| Método | Endpoint         | Descripción                              |
|--------|------------------|------------------------------------------|
| POST   | `/users`         | Registro de usuario con validaciones     |
| POST   | `/login`         | Login básico y generación de token       |
| GET    | `/tasks`         | Listado de tareas del usuario            |
| POST   | `/tasks`         | Crear tarea (valida campos obligatorios) |
| DELETE | `/tasks/{id}`    | Eliminar tarea (solo si pertenece al user)|

---

## 📌 Estado actual

Proyecto en versión inicial. Lo uso como base para probar integraciones, testing y manejo de errores en backend. El objetivo es seguir evolucionándolo con autenticación JWT, mejoras de seguridad y CI/CD completo.

---
