#COMP5130f2022

# Project on live Server:
Weblink: https://cms-uml.herokuapp.com/

Note: For Admin module, please use following credential to login
- Email: admin123@gmaill.com
- Password: Admin@123

As admin and departments cannot sign up. We have already define the admin credential in the database table before hosting the website. And, Only the Admin can generate departments with the login credentials so department cannot have sign up functionality.

If you want to try existing department login then we have created 'Recreation' department for testing purpose. 
- Email: recreation.admin@uml.edu
- Password: rec@admin

# Project on Localhost:
We have used Spring boot framework (Java framework) with MVC pattern for our project where we have .jsp pages as a View (front-end). We have MySQL as a database for our project.

In order for you to start the application on your localhost, please follow the following steps

- Please check the JDK is installed on your system by command 'java -version' in command prompt or terminal
- Download the JDK from https://www.oracle.com/java/technologies/downloads/#java11 if your system does not have JDK installed
- You should have IDE that interpret and support java environment like Eclipse, NetBeans, IntelliJ etc. (Eclipse is recommended)
- From the IDE, please import our source code as an existing Maven project. (Files -> import -> existing maven project -> browse the source code path ->  finish)
- As we have pom.xml, all the project related dependencies should be downloaded by the IDE. If you find any error in pom.xml, please right click on the project in 'Project Explorer' window in the case of Eclipse and force update the Maven, Project_Name -> Maven -> Update Project Configuration -> Force Update of Snapshots/Releases 
- Please go to, src/main/resources/application.properties where you need to change the Url, username and password according to your localhost database
- Please note: you need not to create any tables here as the Spring JPA will automatically create the tables for you. You just need to have one database in your DBMS software (For example, MySQL workbench). So, the Spring boot will automatically create the tables in the given database url
- Now in order to start the application on localhost, please go to src/main/java/com/example/demo where you will find DemoApplication.java which is the main file to start Spring boot application
- In the file, right click and run the file as 'Java Application' which will start the port 8080
- Final step, hit 'localhost:8080' on any browser and the application will be running
