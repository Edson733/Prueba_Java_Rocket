# Prueba de Java

Este es un aplicativo  desarrollado en Java utilizando **Spring Boot**, **Thymeleaf**, **MyBatis** y **Bootstrap**. Permite registrar y listar tareas de manera sencilla.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación utilizado.
- **Spring Boot**: Framework para crear aplicaciones web de manera rápida y sencilla.
- **Thymeleaf**: Motor de plantillas para la generación de vistas HTML.
- **MyBatis**: Framework ORM para la interacción con la base de datos.
- **Bootstrap**: Framework CSS para diseño responsivo y moderno.
- **MySQL**: Sistema de gestión de bases de datos utilizado.

## Estructura del Proyecto
pruebajava/
├── src/
│    └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── pruebajava/
│       │               ├── config/
│       │               │   └── MyBatisConfig.java
│       │               ├── controller/
│       │               │   └── TareaController.java
│       │               ├── model/
│       │               │   └── TareaModel.java
│       │               ├── mapper/
│       │               │   └── TareaMapper.java
│       │               └── service/
│       │                   └── TareaService.java
│       └── resources/
│           ├── static/
│           │   └── assets/
│           │       └── db/
│           │           └── prueba_java
│           ├── templates/
│           │   ├── inicio.html
│           │   ├── mostrar-tareas.html
│           │   └── tarea-nueva.html
│           └── application.properties
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md


## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/gestor-tareas.git

2. Navega al directorio del proyecto:
   ```bash
   cd gestor-tareas

3. Asegurarse de tener Java 17 y Maven instalados en tu sistema.

4. Configurar la base de datos en el archivo application.properties:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/prueba_java
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   mybatis.type-aliases-package=com.example.pruebajava.model

5. Compilar y ejecutar el proyecto:
   ```bash
   mvn spring-boot:run

## Uso
1. Accede a la aplicación en tu navegador en la dirección http://localhost:8080.
2. En la página de inicio, encontrarás un botón para registrar una nueva tarea.
3. Completa los campos del formulario y haz clic en "Guardar" para registrar la tarea.
4. Después de guardar, serás redirigido a la lista de tareas, donde podrás ver todas las tareas registradas (cabe mencionar que por alguna razon no se visualizan las fechas, pero si se registran en la base de datos).