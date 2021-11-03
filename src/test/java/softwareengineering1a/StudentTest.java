/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softwareengineering1a;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ciangibbons
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("Running JUnit Test for getName()");
        //Create an instance of Student with a specific name
        //Get the result of getName()
        //Compare with the initial name
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        String expResult = name;
        String result = instance.getName();
        //Ensure both are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("Running JUnit Test for getId()");
        //Create a Student
        //get the number of students off the static count of Students
        //get the id of the Student using getId()
        //ensure that the id number of the student and the number of students are equal
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        int expResult = Student.getNumberOfStudents();
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("Running JUnit Test for getUsername()");
        // Create an instance of Student
        // using the date of birth of the student, calculate the students age
        // using the age of the student and the name of the student we can make the username of the student.
        // compare the calculated username of the student with that of the result of getUsername()
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        int age = new Period(dob, DateTime.now()).getYears();
        
        String expResult = name + age;
        String result = instance.getUsername();
        //Ensure both usernames are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("Running JUnit Test for getAge()");
        //Create an instance of Student
        // using the date of birth of the student calculate the age of the student
        // compare the result of the calculations with the result of getAge|()
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        int expResult = new Period(dob, DateTime.now()).getYears();
        int result = instance.getAge();
        //Ensure both ages are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        System.out.println("Running JUnit Test for getDob()");
        //create an instance of Student with a specific DOB
        //get the DOB of the Student using getDob()
        //compare the result of getDob() with the initial DOB
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        DateTime expResult = dob;
        DateTime result = instance.getDob();
        //ensure both DOBs are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("Running JUnit Test for getCourses()");
        //Create an instance of Student using the constructor that allows you to pass in a list of courses
        //compare the result of getCourses() with the initial list of courses passed in.
        
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<CourseProgramme> listOfCourses = new ArrayList<>();
        listOfCourses.add(new CourseProgramme("BCT", academicStartDate, academicEndDate ));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob, listOfCourses );
        
        ArrayList<CourseProgramme> expResult = listOfCourses;
        ArrayList<CourseProgramme> result = instance.getCourses();
        //ensure that both lists or courses are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("Running JUnit Test for getModules()");
        //Create an instance of Student using the constructor that allows you to pass in a list of modules
        //compare the result of getModules() with the initial list of modules passed in
        
        ArrayList<Module> listOfModules = new ArrayList<>();
        listOfModules.add(new Module("Software Engineering", "CT417"));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( listOfModules, name, dob );
        
        ArrayList<Module> expResult = listOfModules;
        ArrayList<Module> result = instance.getModules();
        //ensure that both lists of modules are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("Running JUnit Test for setName()");
        //Create an instance of Student using a specific name
        //Overwrite the name of the student using the setName() method
        //Compare the name of the Student received from getName() with the name that was used to overwrite the original name with
        //Ensure both are equal
        String newName = "Cian Pádraig Gibbons";
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setName( newName );
        
        String expResult = newName;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Student.
     */
    @Test
    public void testSetUsername() {
        System.out.println("Running JUnit Test for setUsername()");
        //Create an instance of Student
        //Set the username of the student with the new Username
        //compare the username of the student received by getStudent() with the new Username
        String username = "cgibbons21";
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setUsername(username);
        
        String expResult = username;
        String result = instance.getUsername();
        //Ensure both are equal
        assertEquals( expResult, result );
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("Running JUnit Test for setAge()");
        //Create an instance of Student
        //Overwrite the age of the student with the new age
        //compare the result of getAge() with the new age of the Student
        int age = 18;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setAge(age);
        
        int expResult = age;
        int result = instance.getAge();
        //Ensure that both ages are equal.
        assertEquals( expResult, result );
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        System.out.println("Running JUnit Test for setDob()");
        //Create an instance of Student
        //Overwrite the DOB of the Student with a new DOB
        //Compare the result of getDob() with the new DOB and ensure they are equal
        DateTime newDOB = new DateTime(2003, 1, 21 ,0 , 0 , 0 );;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setDob(newDOB);
        
        DateTime expResult = newDOB;
        DateTime result = instance.getDob();
        //ensire that both DOBs are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        System.out.println("Running JUnit Test for setCourses()");
        //Create an instance of Student
        //Create a list of Courses
        //Set the Student's list of Courses
        //Compare the result of getCourses() with the list of Courses that was created initially
        //Ensure they are equal
        
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add( new CourseProgramme( "BCT",academicStartDate, academicEndDate ));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setCourses(courses);
        
        ArrayList<CourseProgramme> expResult = courses;
        ArrayList<CourseProgramme> result = instance.getCourses();
        //Ensure both lists of Courses are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        System.out.println("Running JUnit Test for setModules()");
        //Create an instance of Student 
        //Create a list of Modules
        //Set the Student's list of Modules
        //Compare the result of getModules() with the list of Modules that was created initially
        //Ensure they are equal
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("Software Engineering", "CT417"));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setModules(modules);
        ArrayList<Module> expResult = modules;
        ArrayList<Module> result = instance.getModules();
        //Ensure that both lists of modules are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("Running JUnit Test for setId()");
        //Create a Student
        //Set the ID of the Student to a new ID
        //Compare the new ID with the ID returned by getId()
        //Ensure that they are equal
        int newID = 18325633;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setId(newID);
        int expResult = newID;
        int result = instance.getId();
        //Ensure both IDs are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfStudents method, of class Student.
     */
    @Test
    public void testGetNumberOfStudents() {
        System.out.println("Running JUnit Test for getNumberOfStudents()");
        //Get the number of students off the static count of Students
        //the expected result will be the current static count of students plus 1 
        //(to take into account the student that is about to be made in order to ensure that the count is working)
        //Create an instance of Student in order to get the static count to increase by 1
        //Get the new number of students off the static count of students
        //Compare both values
        int expResult = Student.getNumberOfStudents() + 1;
        System.out.println(" --- # Students Before Creating: " + Student.getNumberOfStudents());
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 , 0 , 0 , 0 );
        new Student( name, dob );
        System.out.println(" --- # Students After Creating: " + Student.getNumberOfStudents());
        
        int result = Student.getNumberOfStudents();
        //Ensure that both values are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumberOfStudents method, of class Student.
     */
    @Test
    public void testSetNumberOfStudents() {
        System.out.println("Running JUnit Test for setNumberOfStudents()");
        //Set the number of Students to be 2000 using the setNumberOfStudents() method
        //Get the number of Students off the Static count, this will be used to ensure that the value was updated
        int numberOfStudents = 2000;
        Student.setNumberOfStudents(numberOfStudents);
        
        int expResult = numberOfStudents;
        int result = Student.getNumberOfStudents();
        //Ensure that the values are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("Running JUnit Test for addModule()");
        //Create a new instance of Student
        //Create a new instance of a module to be added to the students list of modules
        //Add the module to the students list of modules
        //ensure that the module is now contained on the students list of modules
        Module module = new Module("Software Engineering 3","CT417");
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.addModule(module);
        
        assertTrue(instance.getModules().contains(module));
    }

    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        System.out.println("Running JUnit Test for addCourse");
        //Create an instance of Student
        //Create an instance of Course to be added to the students list of courses
        //Add the course to the students list of courses
        //ensure that the course is on the students list of courses
        String courseName = "BCT";
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        
        CourseProgramme course = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.addCourse(course);
        
        assertTrue(instance.getCourses().contains(course));
    }
    
}
