# Traini8 - Government Funded Training Centers Registry

This project is the MVP for the **Traini8** startup, designed to manage the registry of government-funded training centers. It provides REST APIs for creating and retrieving training center details using Spring Boot, with potential integration of either the Spring or Play framework.

## Features

- **Create a Training Center**: POST API for adding new training centers.
- **Retrieve Training Centers**: GET API for fetching saved training centers.
- **Validation**: Includes validation for fields such as center name, center code, contact email, and phone number.

## Technologies Used

- **Backend Framework**: Spring Boot
- **Database**: JPA / Hibernate
- **Java Version**: Java 17+
- **Validation**: Jakarta Bean Validation
- **Exception Handling**: Custom Global Exception Handling
- **Build Tool**: Maven
- **Logging**: SLF4J with Logback
- **API Documentation**: SpringFox / OpenAPI (optional)

## API Endpoints

### 1. Create Training Center
**POST** `/api/training-centers`

Request Body Example:
```json
{
  "centerName": "Tech Learning Hub",
  "centerCode": "ABC123456789",
  "address": {
    "street": "123 Main St",
    "city": "New York",
    "state": "NY",
    "zipCode": "10001"
  },
  "studentCapacity": 200,
  "coursesOffered": [
    "Java Development",
    "Data Science",
    "Cloud Computing"
  ],
  "contactEmail": "info@techhub.com",
  "contactPhone": "1234567890"
}
