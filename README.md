Quiz Application (Backend API)
Hi there! I am Nguyen Le Duc Nhat, a second-year IT student at the University of Science (VNU-HCMUS).
This repository contains the backend implementation of a Quiz Application, designed to handle quiz management, user attempts, and scoring logic.

🚀 Features
RESTful API Design: Built with Spring Boot for scalability and ease of integration.

Database Management: Integrated with MySQL using Spring Data JPA.

ORM: Leverages Hibernate for efficient data mapping and schema updates.

Logging: SQL query logging enabled for easier debugging and development.

🛠️ Prerequisites
Before running this project, ensure you have the following installed:

Java Development Kit (JDK): Version 17 or higher.

Maven: For dependency management.

MySQL Server: Ensure the service is running on your machine.

An IDE: IntelliJ IDEA, Eclipse, or VS Code.

⚙️ Setup and Installation
Follow these steps to get the project running locally:

1. Clone the Repository
Bash

git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
2. Database Configuration
To connect the application to your local MySQL instance, you need to create an application.properties file:

Locate the file named src/main/resources/application.properties.example.

Copy its content and create a new file named application.properties in the same directory.

Replace the placeholder values with your local database credentials:

Properties

# MySQL Connection URL (Change 'your_database' to your local schema name)
spring.datasource.url=jdbc:mysql://localhost:3306/your_database

# Your MySQL Username (usually 'root')
spring.datasource.username=your_username

# Your MySQL Password
spring.datasource.password=your_password

# Hibernate Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
3. Run the Application
You can start the application using Maven in your terminal:

Bash

mvn spring-boot:run
Alternatively, run the QuizApplication.java file directly from your IDE.

📖 API Documentation
The API will be available at http://localhost:8080. (Note: If you have specific endpoints like /api/quizzes, you might want to list them here.)

🤝 Contact
Author: Nguyen Le Duc Nhat

University: University of Science (VNU-HCMUS)

Major: Information Technology

Would you like me to add a specific section for API Endpoints (like GET, POST requests) or instructions on how to use Postman to test your quiz logic?
