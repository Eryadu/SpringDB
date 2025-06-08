

## CommandLineRunner in Spring Boot is an interface that allows you to execute code after the Spring application
   context has been initialized. This is useful for performing tasks that need to be done once when the application 
   starts, such as:

-- Database initialization: Loading initial data, creating tables, or setting up schema.
-- Configuration loading: Loading specific configurations or settings.
-- Background processes: Starting background tasks or services.
-- Command-line argument processing: Accessing and using command-line arguments passed to the application.

-- When a class implements CommandLineRunner, its run method is automatically executed by Spring Boot after the 
   application context is loaded. This provides a convenient way to perform initialization logic without needing 
   to manually trigger it.

-- CommandLineRunner provides access to command-line arguments as a simple string array 
   (Which passed in main method String[] args). This allows you to process and use these arguments in your
   initialization logic. 

-- void run(String ..arg)
-- Parameter: This method contains varargs parameters for handling multiple string objects.
-- Return type: It doesn't return anything (void)
-- We do use it because if it's associative advantages of using the command line runner interface as described. 
   Debugging is very easy using the command-line runner interface because we don't need to explicitly call the 
   particular resources via API calls, we can call them using the run method of the command-line runner interface that 
   is executed immediately once the application is executed successfully.
