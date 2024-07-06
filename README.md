# BankApp - Gestión de Cuentas Bancarias
## Descripción del proyecto
BankApp es una aplicación bancaria diseñada para gestionar cuentas de usuarios mediante una API RESTful construida con Java y Spring Boot. Esta aplicación permite a los usuarios realizar operaciones básicas como la creación, lectura, actualización y eliminación de cuentas bancarias. Además, incluye autenticación segura utilizando tokens JWT para proteger los endpoints de la API.

### Diagrama de Clases Simplificado

```plaintext
 --------------------------           --------------------------            --------------------------       
|         User             |         |      Authentication      |          |      JwtTokenUtil         |
 --------------------------           --------------------------            --------------------------       
| - id: Long               |         | - authenticateUser()    |          | - generateToken()         |
| - username: String       |         |                          |          | - validateToken()         |
| - password: String       |         |                          |          |                          |
 --------------------------           --------------------------            --------------------------       
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
 --------------------------           --------------------------            --------------------------       
|       Account            |         |     CheckingAccount     |          |     SavingsAccount        |
 --------------------------           --------------------------            --------------------------       
| - id: Long               |         | - id: Long               |          | - id: Long               |
| - balance: BigDecimal    |         | - balance: BigDecimal    |          | - balance: BigDecimal    |
| - user: User             |         | - user: User             |          | - user: User             |
 --------------------------           --------------------------            --------------------------       
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                  ----------------------                  |
         |                                 | CustomUserDetailsService |                |
         |                                  ----------------------                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
         |                                       |                                  |
 --------------------------           --------------------------            --------------------------       
|   JwtRequestFilter       |         |  WebSecurityConfig      |          | AuthenticationController |
 --------------------------           --------------------------            --------------------------  
```
## Configuración

### Requisitos previos

Antes de comenzar con la configuración, asegúrate de tener instalados los siguientes requisitos:

- **JDK 17**: Java Development Kit versión 17.
- **Maven**: Herramienta de gestión de proyectos para Java.
- **MySQL Server**: Servidor de base de datos relacional MySQL.

### Configuración del proyecto

1. **Clonar el repositorio:**

```bash
git clone https://github.com/Blasphus666/bankapp
cd bankapp
```

### Tecnologías utilizadas
- **Java**: El lenguaje de programación principal para el backend. 
- **Spring Boot**: Para el desarrollo rápido y eficiente de aplicaciones basadas en Spring.
- **Spring Security**: Para manejar la autenticación y autorización.
- **JWT (JSON Web Tokens)**: Para la autenticación segura de los usuarios.
- **MySQL**: Como base de datos relacional para almacenar información de usuarios y transacciones
- **Hibernate**: Para la gestión de la persistencia de datos.
- **Maven**: Para la gestión de dependencias y el build del proyecto.

### Estructura de Controladores y Rutas

1. **AuthenticationController:**
    - `POST /authenticate`: Autenticar a un usuario y generar un token JWT.
    - `POST /register`: Registrar un nuevo usuario.

2. **UserController:**
    - `GET /user/{id}`: Obtener información del usuario por ID.
    - `PUT /user/{id}`: Actualizar información del usuario por ID.

3. **AccountController:**
    - `GET /account/{id}`: Obtener información de la cuenta por ID.
    - `POST /account`: Crear una nueva cuenta.
    - `PUT /account/{id}`: Actualizar información de la cuenta por ID.
    - `DELETE /account/{id}`: Eliminar una cuenta por ID.

4. **TransactionController:**
    - `GET /transaction/{id}`: Obtener información de una transacción por ID.
    - `POST /transaction`: Crear una nueva transacción.
    - `GET /transactions`: Listar todas las transacciones.

## Enlaces Adicionales
- **https://prezi.com/p/edit/tuzn3isz6wdb/**

## Trabajo futuro

- Implementar funcionalidades adicionales como transferencias bancarias, histórico de transacciones, alertas de ahorro, bot de ayuda programada para gestión de recibos.
- Mejorar la seguridad y la gestión de roles utilizando Spring Security.
- Implementar pruebas unitarias y de integración para garantizar la estabilidad y la calidad del código.

## Recursos

- [Documentación de Spring Boot](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/)
- [Documentación de Spring Security](https://docs.spring.io/spring-security/site/docs/current/reference/html5/)
- [Documentación de Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [MySQL Documentation](https://dev.mysql.com/doc/)

## Desarrollado por:

## Andrés David Galindo Ramírez