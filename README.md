
# 🚀 Hello World API (Java + Spring Boot)

A simple web API built with Spring Boot that responds with "Hello world" at the `/hello` endpoint.  
This is a basic starter project for learning how to build and test HTTP APIs in Java.

---

## 📦 Requirements

- Java 17+ (or your target version)
- Gradle (wrapper is included, no need to install manually)

---

## 🔧 Setup

Clone the repository and build the project:

```bash
git clone https://github.com/your-username/hello-world-api-java.git
cd hello-world-api-java
./gradlew build
```

*(On Windows, use `gradlew.bat` instead of `./gradlew`)*

---

## 🚀 Run the Server

Start the API server:

```bash
./gradlew bootRun
```

The server will be running at:  
👉 **http://localhost:3033/hello**

---

## 🔍 Test the Endpoint

Test in browser or using `curl`:

```bash
curl http://localhost:3033/hello
```

Expected response:

```
Hello world from JAVA with love
```

---

## 🧪 Run Tests

Run unit and integration tests:

```bash
./gradlew test
```

Expected output:

```
BUILD SUCCESSFUL
```

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── your/package/
            └── HelloController.java # API endpoint definition
build.gradle          # Project dependencies and build configuration
settings.gradle       # Project settings
gradle/               # Gradle wrapper files
gradlew, gradlew.bat  # Gradle wrapper scripts
```

---

## 🛠 Built With

- [Java](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Gradle](https://gradle.org/)

---

## 📜 License

MIT License — feel free to use this project for learning or personal use.