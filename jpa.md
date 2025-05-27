## SpringData JPA : it simplified the way to you store data in database.
Hibernate is just an ORM tool that take data in form of objects and automatically store in Database

## Under the hood how hibernate work 

https://www.geeksforgeeks.org/hibernate-architecture/?ref=
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