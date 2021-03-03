# employeeMS
Simple backend micro service written using Spring boot for managing uers.

This application is configured to write and read user data from in-memory H2 database. UserRepository interface and the require JPA User entity has been added to facilitate this.
On application startup it populates some test data to the database (see the image below).

![image](https://user-images.githubusercontent.com/7077582/109719671-9caaf280-7b6e-11eb-88e7-828e50d356f9.png)

# Task
A simple Usercontroller class has been added to the application. But the code required to expose the REST endpoints to get the list of users and to add new user is missing.
Please follow the hints with //TODO comments and write the code

![image](https://user-images.githubusercontent.com/7077582/109719873-e85d9c00-7b6e-11eb-8b54-cde294409176.png)



