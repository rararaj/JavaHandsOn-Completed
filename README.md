# userMS
Simple backend micro service written using Spring boot for adding/retrieving users.

This application is configured to write and read user data from in-memory H2 database. UserRepository interface and the require JPA User entity has been added to facilitate the CRUD operations in H2 database. On application startup it populates some test data to the database (see the image below).

![image](https://user-images.githubusercontent.com/7077582/109755324-6e97d380-7bab-11eb-871f-4da39c03f085.png)

# Task
A Usercontroller class has been added to the application. But the code required to expose the REST endpoints to get the list of users & to add new user is missing.
Please follow the hints with //TODO comments and add the missing code

![image](https://user-images.githubusercontent.com/7077582/109719873-e85d9c00-7b6e-11eb-8b54-cde294409176.png)



