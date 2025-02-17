<<<<<<< HEAD
# E-tour-master
![HomePage](/Photos/HomePage.png)
=======
# E-Tour ✈️🌍

## Overview
E-Tour is a B2C web application developed to facilitate group tour operators managing **international, domestic, and event-based tours**. The system allows users to **browse, search, view, and book tours**, offering a streamlined and flexible experience.

## Tech Stack 🛠️
### Backend:
- **Jakarta EE**
- **Spring Boot 3**
- **Spring 6**
- **Maven 3**
- **REST API**
- **JPA (Java Persistence API)**
- **MySQL 8**
- **JWT Authentication** 🔐
- **Microservices Architecture** 🏗️

### Frontend:
- **React JS 18** ⚛️
- **JavaScript (ES6+)**
- **HTML5 & CSS3** 🎨
- **Bootstrap / Material UI** 🖌️

## Features 🚀
- **User Authentication & Authorization** 🔑: JWT-based secure login & role-based access
- **Tour Management** 🗺️: Search and browse various tour packages
- **Detailed Tour View** 📋: Itinerary, pricing, departure dates, and availability
- **Booking System** 🛒: Add passengers, confirm bookings, and generate invoices
- **Database-Driven** 💾: Ensures flexibility and easy maintenance

## Installation & Setup ⚙️
### Prerequisites
Ensure you have the following installed:
- **Java 17+** ☕
- **Node.js 18+ & npm** 📦
- **MySQL 8** 🗄️
- **Maven 3** 🏗️

### Backend Setup 🏠
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/e-tour.git
   cd e-tour/etour-api
   ```
2. Configure MySQL database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/etour
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build and run the application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup 🎨
1. Navigate to the frontend directory:
   ```sh
   cd ../etour-app
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the development server:
   ```sh
   npm start
   ```

## API Endpoints 🔗
| Endpoint              | Method | Description |
|----------------------|--------|-------------|
| `/api/auth/signup`   | POST   | User registration ✍️ |
| `/api/auth/login`    | POST   | User authentication 🔑 |
| `/api/tours`        | GET    | Fetch available tours 🗺️ |
| `/api/tours/{id}`    | GET    | Get tour details 📋 |
| `/api/bookings`      | POST   | Book a tour 🛒 |


## Contributing 🤝
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.


## Contact 📧
For any queries, contact **sdandare331@gmail.com**.

>>>>>>> ac0a3da2f17a5af3a39b5c058fe4b2359168d00c
