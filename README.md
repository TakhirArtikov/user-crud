# Project information

This is CRUD project which deals with User details. There are 4 endpoints:
- to get the list of users' details
-  to add user detail
-  to update user details 
-   to delete user details

The link to test the project:
http://localhost:8080/swagger-ui/index.html

![](.png)

### To run project :
```sh
docker- compose up --build -d
```
we need to run this command in IDEA terminal
###### OR
use command `mvn clean install` and check if the build is successful and run the following command
```
java -jar -Dserver.port=8080 target/user-crud-0.0.1-SNAPSHOT.jar
```
 
### Used technologies
1. Java 11
2. Spring Boot  2.6.7
3. OpenAPI 1.6.6
4. PostgreSql 
5. Docker 

### Dependencies
```
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.6</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.24</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
```
