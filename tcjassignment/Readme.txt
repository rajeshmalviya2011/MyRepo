Title: TCJ Assignment
Description : TCJ Assigment based on spring boot to check springboot skills
The application had following modules
Create restful services to do:

a) Register a Customer with a BankAccount

b) Query all BankAccounts of a Customer with a particular openingDate

c) Query all Customers opening a BankAccount on a particular openingDate

d) Create a Transaction

e) Query all Transactions of a particular Customer

f) Query all Transactions of a particular Customer of a particular Date

Technologies Used: Spring boot,JPA,h2 in memory database

To run project
Right click on TcjassignmentApplication.java and run as java application. I will use embedded tomcat server.

Swagger document URL :http://localhost:8080/swagger-ui.html  


application.properties(inside src/main/resources) to define which database to connect. For connectivity define url,username,password,port.

data.sql(inside src/main/resources) define scripts which needs to be executed after server starts up.