# Domain Model
<hr>

## User entity and resource
### Basic entity checklist:
* Basic attributes
* Associations (instantiate collections)
* Constructors
* Getters & Setters (collections: only get)
* hashCode & equals
* Serializable

<hr>

## H2 database, test profile, JPA repository
### Checklist:
* JPA & H2 dependencies
* application.properties
* application-test.properties
* Entity/; JPA mapping
* Repository

#### Dependencies:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

#### application.properties:
```
spring.profiles.active=test
spring.jpa.open-in-view=true
```

#### application-test.properties:
````
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
````