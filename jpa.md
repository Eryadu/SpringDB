## SpringData JPA : it simplified the way to you store data in database.
Hibernate is just an ORM tool that take data in form of objects and automatically store in Database

## Under the hood how hibernate work 

https://www.geeksforgeeks.org/hibernate-architecture/?ref=
-- Below written steps work in reverse order.
-- first we need to start transaction for any DDl Query, 
-- for transaction we need to open session
-- for session we need sessionFactory
-- for. sessionFactory we need to tell hibernate which database will use and for that we need to config the properties
-- under hibernate.cfg.xml

## In JPA, @Entity marks a Java class as a persistent entity, meaning it will be mapped to a database table.
@Table provides more control over how the entity is mapped to the database table, allowing you to customize the 
table name, schema, or other attributes.

## Key Differences:
Purpose:
@Entity identifies a class as eligible for persistence, while @Table specifies details about the database table itself.
Usage:
@Entity is mandatory for JPA entities, while @Table is optional and used for customization.
Defaults:
If @Entity is used without @Table, JPA uses default settings (e.g., table name matches entity name).
In essence:
@Entity declares a class as an entity, and JPA handles the mapping to a database table.
@Table allows you to fine-tune the mapping, such as specifying a different table name or schema.
For example:
Java

@Entity
@Table(name = "customers", schema = "public") // Customizes table name and schema
public class Customer {
// ... entity attributes
}
Without @Table, the Customer entity would be mapped to a table named "Customer" in the default schema. The @Table 
annotation specifies that the entity should be mapped to the "customers" table in the "public" schema. 

## Important Note
## In JPA "save" command work for both insert the data and update the data. It differentiated whether perform insert
   or update, first check by select query (internally), data already exit or not , if data exit then it fire update 
   query else it will fire insert query.
   
## @Repository is just alias for @Component to differentiate the DataBase class. @Repository automatically handle 
   all the exceptions related to dataBase
   
## Get v/s Load method
Get: when query get fired, it showed query and return data, which we can use
Load: when query get fired, it doesn't show query until we use it somewhere or print it. So Load produces fake or 
proxy objects, which we just use to pass to other objects i.e. Laptop data would be passed to Student.