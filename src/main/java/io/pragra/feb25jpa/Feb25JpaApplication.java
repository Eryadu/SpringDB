package io.pragra.feb25jpa;

import io.pragra.feb25jpa.entities.Student;
import io.pragra.feb25jpa.repo.StudentRepo;
import io.pragra.feb25jpa.services.StudentServiceTest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Feb25JpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Feb25JpaApplication.class, args);
//------------------------------------------------------------------------------------------------
        //H2DB
        /* StudentService studentService = context.getBean(StudentService.class);
        studentService.displayStudent();
        studentService.addStudent(new Student(7,"ABC","23"));
        studentService.updateStudent(new Student(7,"YAD","32"));
        studentService.deleteStudent(7);
        Student student = studentService.getStudentById(5);
        System.out.println(student);*/

        //------------------------------------------------------------------------------------------------

        /*StudentServiceTest studentService = context.getBean(StudentServiceTest.class);
        studentService.createStudent();
        studentService.getAllStudents().forEach(System.out::println);
*/

        //------------------------------------------------------------------------------------------------
        // Hibernate

       /* Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Yad");
        a1.setAtech("Spring");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Tim");
        a2.setAtech("Java");

       *//* Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname("Sam");
        a3.setAtech("Java");*//*

        //hey hibernate save with a1 object

        *//*Configuration config = new Configuration();
        config.configure(); // we can add as well "hibernate.cfg.xml", its optional.
        config.addAnnotatedClass(Alien.class);

        SessionFactory factory = config.buildSessionFactory();*//*

        // Replace above 3 lines in single
        SessionFactory factory = new Configuration()
                                .addAnnotatedClass(Alien.class)
                                .configure()
                                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Save data to database
        // use persist() when you want to insert data
        session.persist(a1);
       *//* session.persist(a2);
        session.persist(a3);*//*

        // get() method in hibernate 6, Fetch data from DB // we don't need transaction for fetch, only need for update, delete

        // get() is Eager loading(fetching) means if we are not printing even then it fire query, but byId.load and
        // byId.reference are using lazy loading , they will not fire query if we are not printing them
        // Eager fetching make sense when you know you are going to use fetched data
        // Lazy fetching make sense when you know you are not going to use fetched data

        Alien a8 = session.get(Alien.class, 101); // Eager fetching

        //Find method in hibernate 7 data by id
        Alien a3 = session.find(Alien.class, 101); // Eager fetching

        // these all are same to fetch data from db
        Alien a4 = session.byId(Alien.class).load(101); // lazy fetching
        Alien a5 = session.byId(Alien.class).getReference(101); // lazy fetching

        System.out.println(a2);
        System.out.println(a3);
        *//*System.out.println(a4);
        System.out.println(a5);*//*

        // Update data
        // use merge() only when you want to update data not insert
        session.merge(a1);

        // Delete data (hibernate 6 and in hibernate 7 use remove())
        session.delete(a1);

        transaction.commit();

        session.close();
        factory.close();*/

    }
        //-----------------------------------------------------------------------------------------------
    /*@Bean
    // created @Bean, so that it will start with the springboot Bootstrap
    public CommandLineRunner run(StudentRepo studentRepo) throws Exception {
        return (String[] args) -> {
            Student student1 = new Student(102,"John","John@john.com");
            Student student2 = new Student(103,"Julie","Julie@julie.com");
            Student student3 = new Student(104,"Janet","Janet@janet.com");

            studentRepo.save(student1);
            studentRepo.save(student2);
            studentRepo.save(student3);
            studentRepo.findAll().forEach(user -> System.out.println(user));
        };*/
        //-----------------------------------------------------------------------------------------------
    //}
}
