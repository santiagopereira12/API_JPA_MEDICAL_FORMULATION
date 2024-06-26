# API_JPA_MEDICAL_FORMULATION

Esta API JPA Medical Formulation es un proyecto Java que proporciona endpoints para gestionar información relacionada con medicamentos, pacientes, médicos y formulaciones médicas. Utiliza el framework Spring Boot y la persistencia con JPA (Java Persistence API) para interactuar con una base de datos relacional.

## Tablas de la base de datos

El proyecto está diseñado para trabajar con cuatro tablas en la base de datos:

1. **medicamentos**: Almacena información sobre los medicamentos, incluyendo su identificador, nombre y URL asociada.

2. **paciente**: Contiene detalles sobre los pacientes, como su identificador, nombre y apellido.

3. **medico**: Guarda la información de los médicos, incluyendo su identificador, nombre y apellido.

4. **formulacion_medica**: Registra las formulaciones médicas prescritas, con detalles como el identificador de la formulación, la cantidad, la fecha, y las relaciones con los medicamentos, pacientes y médicos correspondientes.
![](https://github.com/santiagopereira12/API_JPA_MEDICAL_FORMULATION/blob/master/diagrama/formulacion_medica.png)


## Funcionalidades

La API proporciona las siguientes funcionalidades:

- **Crear, Leer, Actualizar y Eliminar (CRUD)**: Permite realizar operaciones CRUD en las entidades de la base de datos.

- **Asociaciones entre entidades**: Utiliza relaciones de muchos a uno (`@ManyToOne`) entre la formulación médica y las entidades de medicamentos, pacientes y médicos para establecer las relaciones entre ellas.

## Tecnologías utilizadas

- **Spring Boot**: Framework de desarrollo de aplicaciones Java.

- **Spring Data JPA**: Proporciona una implementación de Repositories para trabajar con bases de datos utilizando JPA.

- **MySQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar los datos.

## Configuración

Antes de ejecutar la aplicación, asegúrate de configurar correctamente la conexión a la base de datos en el archivo `application.properties`. Puedes encontrar un ejemplo de configuración en la sección de configuración del proyecto.

## Ejecución

Para ejecutar la aplicación, sigue estos pasos:

1. Clona el repositorio en tu máquina local.

2. Configura la conexión a la base de datos en el archivo `application.properties`.

3. Compila el proyecto y ejecútalo utilizando tu IDE o herramienta de construcción preferida.

4. Una vez que la aplicación esté en funcionamiento, puedes probar los diferentes endpoints utilizando herramientas como Postman o curl.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún problema o tienes alguna sugerencia de mejora, no dudes en abrir un issue o enviar un pull request.

## Licencia

Este proyecto está bajo la licencia [MIT](https://opensource.org/licenses/MIT).