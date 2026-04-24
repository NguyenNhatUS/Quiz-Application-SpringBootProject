 **Quiz Application – Backend API**

 **Overview**

This repository contains the backend implementation of a Quiz Application, built using Spring Boot.

The system manages question banks, quiz creation, user attempts, and scoring logic via RESTful APIs.

 **Features**

 RESTful API using Spring Boot

 Quiz management (create quizzes from question bank)

 Question bank with category & difficulty

 Automatic scoring logic

 MySQL integration with Spring Data JPA

 Hibernate ORM for entity mapping

 SQL logging enabled for debugging

 **Tech Stack**

    Java 17+
    
    Spring Boot
    
    Spring Data JPA
    
    Hibernate
    
    MySQL
    
    Maven

 **Prerequisites**

Make sure you have installed:
    
    Java Development Kit (JDK 17+)
    
    Maven
    
    MySQL Server
    
    IDE: IntelliJ IDEA / Eclipse / VS Code

 **Setup & Installation**

1 **Clone the Repository**

    https://github.com/NguyenNhatUS/Quiz-Application-SpringBootProject.git


2️ **Database Configuration**

Navigate to:

    src/main/resources/


Copy **application.properties.example**

Create a new file named **application.properties**

Update it with your local **MySQL** credentials:

# **MySQL Configuration**
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password

# **JPA & Hibernate**
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

3️⃣ Run the Application

Using **Maven**:

    mvn spring-boot:run

Or run directly from IDE:

Open 
**QuizApplication.java**

**Click Run**

 Server will start at:

http://localhost:8080

 **API Usage Guide**

The application provides two main modules:

Question Management

Quiz Management

**Quiz Logic**

 **Question APIs (/question)**

Method	Endpoint	Description

Get all questions

    /question/allQuestions	

Get questions by category

    /question/category/{category}	

Add a new question

    /question/add

Add Question
Example Request

    {
        "questionTitle": "What is the capital of France?",
        "option1": "Berlin",
        "option2": "Madrid",
        "option3": "Paris",
        "option4": "Rome",
        "rightAnswer": "Paris",
        "difficultylevel": "Easy",
        "category": "Geography"
    }

🧪 **Quiz APIs (/quiz)**

Method	Endpoint	Description

Create quiz (category, numQ, title)

    /quiz/create

Get quiz questions (without answers)'

    /quiz/get/{id}	

Submit answers & get score	

    /quiz/submit/{id}	

📝 **Quiz Flow Example**

1️⃣ **Create Quiz**

POST 

    /quiz/create?category=Java&numQ=5&title=JavaBasics

2️⃣ **Get Quiz Questions**

    /quiz/get/{id} // /quiz/get/1


➡ Returns QuestionWrapper (no correct answers exposed)

3️⃣ **Submit Quiz Answers**

    [
        {
            "id": 1,
            "response": "Paris"
        },
        {
            "id": 2,
            "response": "Spring Boot"
        }
    ]


 **Response:4**

(Your total score)

🧪 **Testing with Postman**

Open Postman

    Ensure backend is running at http://localhost:8080
    
    Create requests according to endpoints

For POST requests:

    Body → raw
    
    Format → JSON

 Contact

 Author: **Nguyen Le Duc Nhat** (24CTT3)

 Email: nldnhat182006@gmail.com  

 LinkedIn: https://www.linkedin.com/in/nhat-nguyen-spring/

 University: University of Science (VNU-HCMUS) 

 Major: Information Technology

