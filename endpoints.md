# API Energía - Proyecto Backend

API REST desarrollada con Spring Boot para el proyecto Energía que Transforma.

## Requisitos Previos

- Java 24
- MySQL 8.0
- Maven

## Configuración de Base de Datos

1. Crear una base de datos MySQL:
```sql
CREATE DATABASE energia;
```

2. Configurar las credenciales en `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/energia?useSSL=false
spring.datasource.username=root
spring.datasource.password=
```

## Instalación y Ejecución

1. Clonar el repositorio
2. Navegar al directorio del proyecto
3. Ejecutar el proyecto:
```bash
mvn spring-boot:run
```

## Endpoints Disponibles

### Usuarios

#### Registrar Usuario
```bash
curl -X POST http://localhost:8080/user/saveusers \
-H "Content-Type: application/json" \
-d '
{
    "nombre": "Juan",
    "apellido": "Pérez",
    "email": "juan@ejemplo.com",
    "password": "123456"
}
'
```

#### Iniciar Sesión
```bash
curl -X POST http://localhost:8080/user/login \
-H "Content-Type: application/json" \
-d '{
"email":"juan@ejemplo.com",
"password":"123456"
}
'
```

#### Obtener Todos los Usuarios
```bash
curl http://localhost:8080/user/getusers
```

#### Obtener Usuario por ID
```bash
curl http://localhost:8080/user/1
```

#### Verificar Autenticación
```bash
curl -X POST http://localhost:8080/user/checkAuth \
-H "token: tu_token_aqui"
```

### Productos

#### Crear Producto
```bash
curl -X POST http://localhost:8080/producto/postproducto \
-H "Content-Type: application/json" \
-d '{"nombre":"Panel Solar","descripcion":"Panel solar 100W","precio":299.99}'
```

#### Obtener Productos
```bash
curl http://localhost:8080/producto/getproductos
```

### Tipos

#### Crear Tipo
```bash
curl -X POST http://localhost:8080/tipo/posttipos \
-H "Content-Type: application/json" \
-d '{"nombre":"Residencial","descripcion":"Instalación residencial"}'
```

#### Obtener Tipos
```bash
curl http://localhost:8080/tipo/gettipos
```

### Cálculos

#### Crear Cálculo
```bash
curl -X POST http://localhost:8080/calculo/postcalculos \
-H "Content-Type: application/json" \
-d '{"resultado":"500kWh","descripcion":"Cálculo mensual"}'
```

#### Obtener Cálculos
```bash
curl http://localhost:8080/calculo/getcalculos
```

## Notas Importantes

- Todos los endpoints POST requieren el header `Content-Type: application/json`
- Para endpoints autenticados, incluir el token en el header `token`
- Los ejemplos de payload son ilustrativos, ajustar según la estructura de los modelos
- Se recomienda usar Postman u otra herramienta similar para pruebas

## Tecnologías Utilizadas

- Spring Boot 3.5.4
- Spring Security
- Spring Data JPA
- MySQL 8
- Maven
- JWT para autenticación