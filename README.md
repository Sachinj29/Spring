# 🌱 Spring Framework

The **Spring Framework** is one of the most popular, lightweight, and powerful frameworks for building enterprise-grade Java applications.  
It provides comprehensive infrastructure support for developing **Java-based applications** and promotes **loose coupling**, **testability**, and **modularity**.

---

## 📖 Table of Contents
- [Introduction](#-introduction)
- [Core Features](#-core-features)
- [Spring Modules](#-spring-modules)
- [Spring Architecture](#-spring-architecture)
- [Configuration Types](#-configuration-types)
- [Spring Configuration Files](#-spring-configuration-files)
- [Example Setup](#-example-setup)
- [Advantages of Spring](#-advantages-of-spring)
- [References](#-references)

---

## 📌 Introduction
Spring provides a **comprehensive programming and configuration model** for modern Java applications.  
It offers:
- **Dependency Injection (DI)**
- **Aspect-Oriented Programming (AOP)**
- Integration with various persistence frameworks
- Simplified application development with **Java, XML, or Annotation-based** configurations.

---

## 🚀 Core Features
1. **Lightweight** – Minimal overhead for applications.
2. **Dependency Injection (DI)** – Loose coupling via Inversion of Control (IoC) containers.
3. **Aspect-Oriented Programming (AOP)** – Separates cross-cutting concerns like logging, transactions, security.
4. **Transaction Management** – Declarative and programmatic transaction handling.
5. **Data Access Integration** – Works with JDBC, ORM frameworks (Hibernate, JPA, MyBatis).
6. **Model-View-Controller (MVC)** – Web application framework.
7. **Integration** – Works seamlessly with cloud, messaging, and batch processing.

---

## 🧩 Spring Modules
Spring is modular and divided into different modules:

| Module                | Description |
|-----------------------|-------------|
| **Core Container**    | Provides basic functionality, including the IoC container. |
| **Spring Context**    | Framework-style access to objects. |
| **Spring AOP**        | Aspect-oriented programming implementation. |
| **Spring Data Access**| JDBC, ORM, transaction management. |
| **Spring Web MVC**    | Web application development using MVC design pattern. |
| **Spring Security**   | Authentication and authorization for applications. |
| **Spring Test**       | Testing support for Spring components. |

---

## 🏛 Spring Architecture
Spring is built on the **Core Container** and integrates with multiple modules:



---

## ⚙ Configuration Types

Spring supports **three main configuration styles**:

1. **XML-based Configuration**
   - Bean definitions are specified in an XML file.
   - Example:
     ```xml
     <beans>
       <bean id="myBean" class="com.example.MyBean"/>
     </beans>
     ```

2. **Annotation-based Configuration**
   - Use annotations like `@Component`, `@Autowired`, `@Configuration`, `@Bean`.
   - Example:
     ```java
     @Component
     public class MyService { }
     ```

3. **Java-based Configuration**
   - Use `@Configuration` classes instead of XML.
   - Example:
     ```java
     @Configuration
     public class AppConfig {
         @Bean
         public MyBean myBean() {
             return new MyBean();
         }
     }
     ```

---

## 🗂 Spring Configuration Files

- **`applicationContext.xml`** – XML configuration file that defines beans and dependencies.
- **`application.properties` / `application.yml`** – Externalized configuration for environment-specific settings (e.g., DB URL, credentials).
- **Java Config Classes** – Annotated with `@Configuration`.

---

## 🛠 Example Setup

### **Step 1: Add Maven Dependency**
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.0</version>
</dependency>
