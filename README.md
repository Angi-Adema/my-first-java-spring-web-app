# in28minutes TODOs List

## About

This project is a basic RESTful API that utilizes many different frameworks to accomplish the goal of learning various technologies. In this instructor led course, we built a TODOs list with a user login using Java, 
Spring, Spring Boot, Hibernate, Maven, JDBC, JPA, Docker and others. With initial hard coded data we confirmed our content was rendering to the browser before refactoring to include an in memory h2 database and
finally executing a MySQL database using a Docker container.

## Navigation

- Clone the project into a local file and open Maven project using Eclipse IDE.
- Open Docker Desktop.
- Run 'docker run --detach --env MYSQL_ROOT_PASSWORD=password --env MYSQL_DATABASE=todos --name mysql --publish 3307:3306 mysql:8-oracle' in the terminal and confirm the database named 'mysql' is running in Docker.
- Start the Spring server by hitting the play icon at the top of the project page.
- Visit localhost:8080/login in the browser.
- Enter Username: in28minutes and Password: dummy and click 'Sign in'.
- Once logged in either click the link in "Manage your TODOs" or click the "Todos" link at the top of the page. 
- Click "Add TODO".
- Enter a TODO item of your choice and a date you would like to accomplish the TODO by then click "Submit".

## TODOs Page

![TODOs-page-screenshot](./images/TodosScreenShot.png)

## Technology

- HTML
- CSS
- Bootstrap
- Java
- Spring / Spring Boot
- Maven
- JDBC
- JPA
- Hibernate
- MySQL / MySQL Shell
- Docker

## Author

Class Instructor: in28minutes - Ranga Karanam  
Project: Angi Adema  
Email: angi.adema@gmail.com  
LinkedIn: https://www.linkedin.com/in/angelaadema/

## Repo Link

GitHub: https://github.com/Angi-Adema/my-first-java-spring-web-app?tab=readme-ov-file

## Future Development

- Add logic so that a user can create their own login credentials and be able to sign in via Google, GitHub or LinkedIn.
- Add logic to change login credentials once logged in.
- Update the styling so that the project looks more professional.
- Functionality to have the app email or text user on upcoming deadlines.
- Write unit tests and include them in this project.
- Deploy the project so that the app can be accessible from a website.