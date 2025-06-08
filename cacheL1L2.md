
## In Hibernate, L1 and L2 caches are both caching mechanisms designed to improve performance by reducing database 
   calls, but they differ in scope and how they are managed. L1 cache, also known as the persistence context, is always
   enabled and operates within a single Hibernate Session. L2 cache, on the other hand, is optional and can be configured
   to share data across multiple Sessions created by a SessionFactory.

## L1 Cache (Session-Level Cache):
-- Scope: Limited to a single Session.
-- Purpose: Caches entity instances within the current session, preventing redundant database queries for the same 
   entity within that session.
-- Default: Enabled by default.
-- Mechanism: Hibernate stores loaded entities in the Session's persistence context.

## L2 Cache (SessionFactory-Level Cache):
-- Scope: Shared across multiple Sessions created by the same SessionFactory.
-- Purpose: Caches entity instances that can be shared across different sessions, reducing database hits when the 
   same entities are accessed by different parts of the application.
-- Default: Not enabled by default and requires configuration.
-- Mechanism: Uses a third-party caching library like Ehcache, Infinispan, or Redis.
-- Benefits: Reduces database load, especially for read-mostly entities, and improves overall application performance.

## In essence:

## L1 Cache:
   Think of it as a "personal cache" for each session, ensuring you only hit the database once for a specific entity
   within that session.
## L2 Cache:
   Think of it as a "shared cache" for the application, allowing different sessions to share cached data, further 
   reducing database calls across different parts of the application.

## Key Differences Summarized:
Feature       L1 Cache (Session-Level).       L2 Cache (SessionFactory-Level)
Scope         Within a single Session         Shared across multiple Sessions
Default           Enabled                     Disabled, requires configuration
Mechanism     Internal, within Session        External, 3rd-party cache
Usage         Within a transaction            Across different transactions
Persistence   Session scope                   SessionFactory scope

