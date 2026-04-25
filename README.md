📓 JournalApp – Secure Personal Journal API

A secure and scalable Journal Application built using Java Spring Boot that allows users to create, read, and manage their personal journal entries. The application ensures that each user can only access their own data using robust authentication and authorization mechanisms.

---

🚀 Tech Stack

- Java
- Spring Boot
- Spring Security
- REST APIs
- MongoDB
- Redis (Caching)
- JUnit & Mockito (Unit Testing)
- Postman (API Testing)
- External API Integration

---

🔐 Features

- User Authentication & Authorization using Spring Security
- Secure login with credentials
- Create journal entries
- Read personal journal entries (user-specific access)
- Data isolation: Users can only access their own entries
- Integration with external APIs
- Caching using Redis for performance optimization
- Fully tested APIs using JUnit and Mockito

---

📂 API Endpoints (Sample)

Method| Endpoint| Description
POST| /api/auth/register| Register a new user
POST| /api/auth/login| Login user
GET| /api/journal| Get all user journal entries
POST| /api/journal| Create a new journal entry
GET| /api/journal/{id}| Get journal entry by ID

---

🧪 Testing

- Unit testing implemented using JUnit
- Mocking dependencies using Mockito
- API testing performed via Postman

---

⚙️ Setup & Installation

1. Clone the repository
   
   git clone https://github.com/your-username/journalApp.git

2. Navigate to the project directory
   
   cd journalApp

3. Configure MongoDB and Redis in "application.properties"

4. Run the application
   
   mvn spring-boot:run

---

🔧 Configuration

Update the following in "application.properties":

spring.data.mongodb.uri=your_mongodb_uri
spring.redis.host=localhost
spring.redis.port=6379

---

📌 Future Improvements

- Add JWT-based authentication
- Implement pagination & sorting
- Add tags/categories for journal entries
- Frontend integration (React/Angular)
- Deploy on cloud (AWS/Docker)

---

👤 Author

Arcylan Reyaz

---

⭐ Contributing

Contributions are welcome! Feel free to fork this repo and submit a pull request.

---

📄 License

This project is licensed under the MIT License.
