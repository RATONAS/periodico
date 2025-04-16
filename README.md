# 🎶 Periódico de Ayer

**"Lo que se vive cantando, no se olvida."**  
API RESTful desarrollada con Spring Boot y PostgreSQL para la gestión de letras de canciones de salsa y sus artistas.

---

## 📌 Índice

- [📖 Descripción](#-descripción)
- [🚀 Tecnologías utilizadas](#-tecnologías-utilizadas)
- [🛠️ Instalación y uso](#️-instalación-y-uso)
- [🔧 Endpoints disponibles](#-endpoints-disponibles)
- [🧪 Testing](#-testing)
- [📚 Créditos](#-créditos)

---

## 📖 Descripción

**Periódico de Ayer** es una API REST que permite la gestión de letras de canciones de salsa y los artistas que las interpretan. Cada letra contiene un título, contenido (la letra completa), fecha de publicación y categoría. Está asociada a un artista, que puede tener múltiples canciones.

Este proyecto ha sido desarrollado bajo metodologías ágiles, utilizando una arquitectura MVC con tres capas y conexión a base de datos en PostgreSQL.

---

## 🚀 Tecnologías utilizadas

- **Lenguaje**: Java V21.
- **Framework**: Spring Boot V3.4.4.
- **Base de datos**: PostgreSQL.
- **Herramientas**: Visual Studio Code, Git, GitHub, Jira, Postman.

---

## 🛠️ Instalación y uso

1. Clona este repositorio:
   ```bash
   git clone (https://github.com/RATONAS/periodico)

2. Configura tu base de datos PostgreSQL:

Crea una base de datos llamada basic.

Actualiza el archivo application.properties con tus credenciales.

3. Ejecuta la aplicación desde tu IDE o con Maven:

bash
Copiar
Editar
./mvnw spring-boot:run

4. Prueba los endpoints con Postman o cURL.

## 🔧Enpoints disponibles:

## 🎤 Artistas
POST /artists → Crear artista

GET /artists → Listar todos los artistas

GET /artists/{id} → Obtener un artista por ID

DELETE /artists/{id} → Eliminar artista (también elimina sus canciones)

## 🎵 Canciones
POST /songs → Crear una canción

GET /songs → Listar todas las canciones

GET /songs/{id} → Obtener canción por ID

PUT /songs/{id} → Actualizar canción

DELETE /songs/{id} → Eliminar canción

## 🧪 Testing
Se han implementado pruebas de integración usando Postman sobre los endpoints más importantes, 
asegurando el correcto funcionamiento del flujo completo de creación, consulta y eliminación de canciones y artistas.

## 📚 Créditos
Proyecto realizado por el equipo de desarrollo de Periódico de Ayer:

Mariona Cuyàs | Scrum Master & Backend Developer: 
(https://www.linkedin.com/in/mariona-cuyas/)  (https://github.com/cuyass)

Guadalupe Hani | Product Owner & Backend Developer: 
(https://www.linkedin.com/in/guadalupe-hani/)  (https://github.com/GuadalupeSchajris)

Carol Más | Backend Developer: 
(https://www.linkedin.com/in/carolina-mas/)  (https://github.com/Carocitta)

Israel Espín| Backend Developer: 
(https://www.linkedin.com/in/israelespin/)  (https://github.com/iespin)

Karisha Meléndez | Backend Developer: 
(https://www.linkedin.com/in/karisssha/)  (https://github.com/karisssha)

Inspirado en la música, la cultura y la memoria de la salsa. 🎺





