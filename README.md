# JDBC to Spring JPA with Hibernate

This repository demonstrates the process of transitioning from traditional JDBC to Spring JPA with Hibernate for data persistence in Java applications. It covers a range of topics from basic JDBC operations to advanced JPA features, providing a comprehensive guide for modernizing your data access layer.

## Contents

### Step 01: Basic JDBC Setup

- Introduction to JDBC.
- Setting up a basic JDBC connection.
- Performing CRUD operations using JDBC.
- Example project: `jdbc-basic-example`.

### Step 02: Introduction to JPA

- Overview of JPA.
- Setting up Spring JPA with Hibernate.
- Basic CRUD operations with Spring JPA.
- Example project: `jpa-basic-example`.

### Step 03: Entity Relationships

- Understanding entity relationships (One-to-One, One-to-Many, Many-to-One, Many-to-Many).
- Mapping entity relationships using JPA annotations.
- Example project: `jpa-entity-relationships`.

### Step 04: Advanced JPA Features

- JPQL (Java Persistence Query Language).
- Criteria API for dynamic queries.
- Entity lifecycle and callbacks.
- Example project: `jpa-advanced-features`.

### Step 05: Spring Data JPA

- Introduction to Spring Data JPA.
- Creating repositories and custom queries.
- Pagination and sorting.
- Example project: `spring-data-jpa-example`.

### Step 06: Performance Tuning

- Caching with JPA and Hibernate.
- Fetch strategies and lazy loading.
- Performance considerations and best practices.
- Example project: `jpa-performance-tuning`.

## How to Use

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-username/jdbc-to-spring-jpa-hibernate.git
    ```

2. **Navigate to the Desired Module**:
    ```bash
    cd jdbc-to-spring-jpa-hibernate
    ```

3. **Follow the Instructions in Each Module**:
   - Each module contains a README with detailed instructions and explanations.

4. **Run the Examples**:
   - Use your preferred IDE to import and run the projects.
   - Ensure you have the necessary dependencies and database setup as per the instructions.

## Prerequisites

- Basic knowledge of Java and SQL.
- Familiarity with Spring Framework and Hibernate is beneficial but not required.

This repository serves as a practical guide to modernizing your data access layer from JDBC to Spring JPA with Hibernate, providing hands-on examples and detailed explanations for each step.

### application.properties

```properties
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.datasource.url=jdbc:h2:mem:testdb
```
---

### data.sql

```sql
create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ranga', 'Hyderabad',current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'James', 'New York',current_timestamp());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pieter', 'Amsterdam',current_timestamp());

```
---
