package io.pragra.feb25jpa;

import io.pragra.feb25jpa.hibernateManual.Alien;
import io.pragra.feb25jpa.hibernateManual.AlienName;
import io.pragra.feb25jpa.hibernateManual.Laptop;
import io.pragra.feb25jpa.hibernateManual.StudentLap;
import io.pragra.feb25jpa.services.StudentServiceTest;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

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
// this section for RESTAPI/Controller
        StudentServiceTest studentService = context.getBean(StudentServiceTest.class);
        studentService.createStudent();
        studentService.getAllStudents().forEach(System.out::println);

        //------------------------------------------------------------------------------------------------
        // Hibernate

        /*Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Laptop laptop1 = new Laptop();
        laptop1.setLid(102);
        laptop1.setLname("Apple");

        Laptop laptop2 = new Laptop();
        laptop2.setLid(103);
        laptop2.setLname("Bell");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop);
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        StudentLap studentLap = new StudentLap();
        studentLap.setSname("Navin");
        studentLap.setSrollno(1);
        studentLap.setSmarks(50);

        StudentLap studentLap1 = new StudentLap();
        studentLap1.setSname("Ready");
        studentLap1.setSrollno(2);
        studentLap1.setSmarks(70);

        StudentLap studentLap2 = new StudentLap();
        studentLap2.setSname("BapReady");
        studentLap2.setSrollno(3);
        studentLap2.setSmarks(60);

        studentLap.setLaps(laptopList);// for OneToONe
        studentLap1.setLaps(laptopList); // for OneToONe
        studentLap2.setLaps(laptopList); // for OneToONe
        studentLap1.setLaps(laptopList); // for OneToONe
        studentLap1.setLaps(laptopList); // for OneToONe
        studentLap.getLaps().add(laptop); // for ManyToONe
        studentLap.getLaps().add(laptop1); // for ManyToONe
        studentLap.getLaps().add(laptop2); // for ManyToONe
        studentLap1.getLaps().add(laptop2); // for ManyToONe
        studentLap2.getLaps().add(laptop2); // for ManyToONe

        laptop.getStudentLap(); // get the studentList first and then add into laptopTable
        laptop1.getStudentLap(); // get the studentList first and then add into laptopTable
        laptop2.getStudentLap(); // get the studentList first and then add into laptopTable
        laptop.getStudentLap(); // get the studentList first and then add into laptopTable*/

        /*AlienName alienName = new AlienName();
        alienName.setFname("Navin");
        alienName.setLname("Reddy");
        alienName.setMname("Thapitali");

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname(alienName);
        a1.setAtech("Spring");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname(alienName);
        a2.setAtech("Java");

        Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname(alienName);
        a3.setAtech("Hibernate");*/

        //hey hibernate save with a1 object

        //Configuration config = new Configuration();
        /* config.configure(); // we can add as well "hibernate.cfg.xml", its optional.
        config.addAnnotatedClass(Alien.class);

        // in Hibernate 4.0 or afterward a new Interface called ServiceRegistry was introduced to implement configuration
        // Settings in case .buildSessionFactory not work.
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(registry);
*/
        // we can use this single line as well instead of upper two lines.
        //SessionFactory factory = config.buildSessionFactory();

        // Replace above 3 lines in single
       /* SessionFactory factory = new Configuration()
                                .addAnnotatedClass(Alien.class)
                                .addAnnotatedClass(Laptop.class)
                                .addAnnotatedClass(StudentLap.class)
                                .configure()
                                .buildSessionFactory();

        Session session = factory.openSession();*/

        //Transaction object is used to make any changes in Database.And Commit() to make permanent changes
        //Transaction transaction = session.beginTransaction();

        // Save data to database
        // use persist() when you want to insert data
        //session.persist(a1);
       /* session.persist(a2);
        session.persist(a3);*/

        /*session.save(laptop);
        session.save(laptop1);
        session.save(laptop2);

        session.save(studentLap);
        session.save(studentLap1);
        session.save(studentLap2);
*/

        //Fetch Collection Data by Lazy and Eager Method
        /*StudentLap s1 = session.get(StudentLap.class, 1);
        System.out.println(s1);

        List<Laptop> laptopsList = s1.getLaps();
        for (Laptop l : laptopsList) {
            System.out.println(l);
        }*/

        // get() method in hibernate 6, Fetch data from DB // we don't need transaction for fetch, only need for update, delete

        // get() is Eager loading(fetching) means if we are not printing even then it fire query, but byId.load and
        // byId.reference are using lazy loading , they will not fire query if we are not printing them
        // Eager fetching make sense when you know you are going to use fetched data
        // Lazy fetching make sense when you know you are not going to use fetched data

       // Alien a8 = session.get(Alien.class, 101); // Eager fetching

        //Find method in hibernate 7 data by id
        //Alien a3 = session.find(Alien.class, 101); // Eager fetching

        // these all are same to fetch data from db
        /*Alien a4 = session.byId(Alien.class).load(101); // lazy fetching
        Alien a5 = session.byId(Alien.class).getReference(101); // lazy fetching

        System.out.println(a2);
        System.out.println(a3);
       System.out.println(a4);
        System.out.println(a5);*/

        // Update data
        // use merge() only when you want to update data not insert
        //session.merge(a1);

        // Delete data (hibernate 6 and in hibernate 7 use remove())
        //session.delete(a1);

        // use commit() to permanently changes in Db
        /*transaction.commit();

        session.close();
        factory.close();*/
        //-----------------------------------------------------------------------------------------------------

        // L1-L2 Cache

        /*Alien a = null;
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);

        //Fetch the data from Db with ID 101, it fired query once and return two output, cause it save in cache1 and reuse
        // same query
        a =  session.get(Alien.class,101);
        System.out.println(a);

        a = session.get(Alien.class,101);
        System.out.println(a);

        transaction.commit();
        session.close();
*/
        // Creating second session, within secondSession, it fired query two time for same query, L1 cache exist in same
        //session.
        /*Session session1 = factory.openSession();
        Transaction transaction1 = session1.beginTransaction();

        a = session1.get(Alien.class,101);
        System.out.println(a);

        transaction1.commit();
        session1.close();
        factory.close();*/

        //-----------------------------------------------------------------------------------
        //HQL
       /* SessionFactory factory = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Random r = new Random();
        for(int i=0; i<20 ; i++)
        {
            Alien alien = new Alien();
            alien.setAid(i);
            alien.setAname("Name"+i);
            alien.setAmark(r.nextInt(100));
            alien.setAtech("Tec" +i);
            session.save(alien);
        }*/

        //HQL query
        //Query q = session.createQuery("from alien_Table");

        // Query return List of objects
        /*List<Alien> aliens = q.getResultList();
        aliens.forEach(System.out::println);*/

        // if it returned singleObject then don't use list,use UniqueResult or getSingleResult
        /*Query q1 = session.createQuery("from alien_Table where aname='Name0'");
        Alien alien1 = (Alien) q1.getSingleResult();
        System.out.println(alien1);*/

        //if we want to fetch data by  using variable names, then it returned Array of Objects.
        /*Query q2 = session.createQuery("select aname, atech from alien_Table where aname='Name0'");
        Object[] alien2 = (Object[]) q2.getSingleResult();
        for(Object o : alien2)
        {
            System.out.println(o);
        }

        // if wanted to return whole table
        Query q3 = session.createQuery("select aname, atech from alien_Table");
        List<Object[]> alien3 = (List<Object[]>) q3.getResultList();
        for(Object[] o1 : alien3)
            System.out.println(o1[0]);



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
