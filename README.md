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

### Dependencies:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```