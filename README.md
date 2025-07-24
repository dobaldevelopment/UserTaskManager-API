# UserTaskManager-API

Servicio REST para manejar usuarios y tareas, con validaciones y control de sesiones

📁 Estructura base del repositorio

📁 src/
│ └── main/
│     └── java/com/adrieldobal/usertaskmanager/
│         ├── controller/
│         ├── service/
│         ├── model/
│         ├── dto/
│         ├── config/
│         └── exception/
│
│ └── test/java/com/adrieldobal/usertaskmanager/
│     └── service/
│     └── controller/
│
📄 Dockerfile  
📄 docker-compose.yml  
📄 .github/workflows/ci.yml  
📄 application.yml  

🔐 Validaciones y manejo de sesiones
Validaciones con Bean Validation (javax.validation) en DTOs

Ejemplo: @NotBlank, @Email, @Size, etc.

-Captura de errores con un @ControllerAdvice
-Manejo de sesión simple con token UUID (o JWT si querés subir complejidad)
-Manejo personalizado de errores: 400, 401, 404, 500

🧪 Testing con JUnit
-Tests unitarios para servicios (@MockBean, @InjectMocks)
-Tests de integración para endpoints con MockMvc
-Validación de errores y respuestas esperadas

🐳 Docker + GitHub Actions
-Dockerfile optimizado para Java (multi-stage si querés ir pro)
-docker-compose para correr la API con PostgreSQL o SQLite

GitHub Actions:
-Run tests en cada push
-Build del Docker
(opcional) Deploy a Render o Fly.io

🔗 Endpoints
Método	Endpoint	Descripción
POST	/users	    Registro con validaciones
POST	/login	    Generación de sesión/token
GET	/tasks	        Listado de tareas del usuario
POST	/tasks	    Crear tarea con validaciones
DELETE	/tasks/{id}	Eliminar tarea (solo si es del user)