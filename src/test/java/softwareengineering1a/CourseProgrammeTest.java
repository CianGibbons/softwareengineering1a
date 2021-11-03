/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softwareengineering1a;

import java.util.ArrayList;
import org.joda.time.DateTime;
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
public class CourseProgrammeTest {
    
    public CourseProgrammeTest() {
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
     * Test of getName method, of class CourseProgramme.
     */
    @Test
    public void testGetName() {
        System.out.println("Running JUnit Test for getName()");
        String courseName = "BCT";
        
        //Creating a Course Programme instance using the courseName BCT, knowing that getName() should then return BCT
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        String expResult = courseName;
        String result = instance.getName();
        //If the expected result and the actual result are equal, pass the test
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListOfModules method, of class CourseProgramme.
     */
    @Test
    public void testGetListOfModules() {
        System.out.println("Running JUnit Test for getListOfModules()");
        String courseName = "BCT";
        // Create a Course Programme instance using the Contructor that allows you to pass in a list of Modules
        //this way we know in advance the exact list of modules that the getListOfModules() Method Should return.
        
//Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<Module> listOfModules = new ArrayList<>();
        listOfModules.add(new Module("Software Engineering 3","CT417"));
        
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate, listOfModules );
        
        ArrayList<Module> expResult = listOfModules;
        ArrayList<Module> result = instance.getListOfModules();
        // Ensure that the list returned and the list created initially are equal
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListOfStudents method, of class CourseProgramme.
     */
    @Test
    public void testGetListOfStudents() {
        System.out.println("Running JUnit Test for getListOfStudents()");
        String courseName = "BCT";
        //Create an instance of CourseProgramme using the Constructor that allows a list of Students to be passed in
        //This allows us to know in advance that the getListOfStudents method should return the same exact list
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        
        ArrayList<Student> listOfStudents = new ArrayList<>();
        //{"Cian Gibbons","Jamie Larkin","Joe Ribbon"}
        listOfStudents.add(new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 )));
        listOfStudents.add(new Student("Jamie Larkin", new DateTime( 2001, 3, 11, 0, 0, 0 )));
        listOfStudents.add(new Student("Joe Ribbon", new DateTime( 2000, 12, 12, 0, 0, 0)));
        
        CourseProgramme instance = new CourseProgramme( listOfStudents, courseName, academicStartDate, academicEndDate );
        
        ArrayList<Student> expResult = listOfStudents;
        ArrayList<Student> result = instance.getListOfStudents();
        //Ensure both Lists of students are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of getAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicStartDate() {
        System.out.println("Running JUnit Test for getAcademicStartDate()");
        String courseName = "BCT";
        //Create an instance of CourseProgramme with a specific academic start date
        // this allows us to know exactly what the getAcademicStartDate() method should return
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime expResult = academicStartDate;
        DateTime result = instance.getAcademicStartDate();
        //ensure both dates are equal.
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicEndDate() {
        System.out.println("Running JUnit Test for getAcademicEndDate()");
        String courseName = "BCT";
        //Create an instance of CourseProgramme with a specific academic end date
        // this allows us to know exactly what the getAcademicEndDate() method should return
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        DateTime expResult = academicEndDate;
        DateTime result = instance.getAcademicEndDate();
        //Ensure both dates are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CourseProgramme.
     */
    @Test
    public void testSetName() {
        System.out.println("Running JUnit Test for setName()");
        String currentCourseName = "BCT";
        String newCourseName = "BACT";
        //Initialize an instance of CourseProgramme with the course nme BCT
        //use the set name method to change the course name to BACT
        //then we can ensure that setName worked correctly by comparing the course name returned by getName with the new name BACT
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( currentCourseName, academicStartDate, academicEndDate );
        
        
        instance.setName(newCourseName);
        
        String expResult = newCourseName;
        String result = instance.getName();
        //Ensure that the new name is the name returned
        assertEquals( expResult, result );
    }

    /**
     * Test of setListOfModules method, of class CourseProgramme.
     */
    @Test
    public void testSetListOfModules() {
        System.out.println("Running JUnit Test for setListOfModules()");
        //Create an instance of a Course Programme
        //Set the Modules list of the Course using the setListOfModules() method
        //Ensure that getListOfModules returns this same list
        ArrayList<Module> listOfModules = new ArrayList<>();
        listOfModules.add(new Module("Software Engineering", "CT417"));
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        instance.setListOfModules(listOfModules);
        
        ArrayList<Module> expResult = listOfModules;
        ArrayList<Module> result = instance.getListOfModules();
        //ensure both lists are the same
        assertEquals( expResult, result );
        
    }

    /**
     * Test of setListOfStudents method, of class CourseProgramme.
     */
    @Test
    public void testSetListOfStudents() {
        System.out.println("Running JUnit Test for setListOfStudents()");
        //Create an instance of a Course Programme
        //Set the Student list of the Course using the setListOfStudents() method
        //Ensure that getListOfStudents returns this same list
        ArrayList<Student> listOfStudents = new ArrayList<>();
        //{"Cian Gibbons","Jamie Larkin","Joe Ribbon"}
        listOfStudents.add(new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 )));
        listOfStudents.add(new Student("Jamie Larkin", new DateTime( 2001, 3, 11, 0, 0, 0 )));
        listOfStudents.add(new Student("Joe Ribbon", new DateTime( 2000, 12, 12, 0, 0, 0)));
        
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        instance.setListOfStudents(listOfStudents);
        ArrayList<Student> expResult = listOfStudents;
        ArrayList<Student> result = instance.getListOfStudents();
        
        //Ensure that both lists of students are the same       
        assertEquals( expResult, result );
    }

    /**
     * Test of setAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicStartDate() {
        System.out.println("Running JUnit Test for setAcademicStartDate()");
        String courseName = "BCT";
        //Create an instance of CourseProgramme 
        //Overwrite its academic start date using setAcademicStartDate() method
        //Ensure that the new academic start date is the start date returned by getAcademicStartDate()
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime newAcademicStartDate = new DateTime( 2022, 9, 6, 9, 0, 0);
        instance.setAcademicStartDate(newAcademicStartDate);
        
        DateTime expResult = newAcademicStartDate;
        DateTime result = instance.getAcademicStartDate();
        // Ensure both dates are equal
        assertEquals( expResult, result );
    }

    /**
     * Test of setAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicEndDate() {
        System.out.println("Running JUnit Test for setAcademicEndDate()");
        String courseName = "BCT";
        //Create an instance of CourseProgramme 
        //Overwrite its academic end date using setAcademicEndDate() method
        //Ensure that the new academic end date is the start date returned by getAcademicEndDate()
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime newAcademicEndDate = new DateTime( 2023, 5, 31, 6, 0, 0);
        instance.setAcademicEndDate(newAcademicEndDate);
       
        
        DateTime expResult = newAcademicEndDate;
        DateTime result = instance.getAcademicEndDate();
        //ensure both dates are equal
        assertEquals( expResult, result );
    }

    /**
     * Test of addStudent method, of class CourseProgramme.
     */
    @Test
    public void testAddStudent() {
        System.out.println("Running JUnit Test for addStudent()");
        //Create an instance of the Course Programme
        //Add a student to the list of students for the course programme
        //ensure that the list of students for that course contains the new student
        
        Student newStudent = new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 ));
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        instance.addStudent(newStudent);
        
        //ensure that the new student is on the list of students for this course
        assertTrue(instance.getListOfStudents().contains(newStudent));
    }

    /**
     * Test of addModule method, of class CourseProgramme.
     */
    @Test
    public void testAddModule() {
        System.out.println("Running JUnit Test for addModule()");
        //Create an instance of Course Programme 
        //Add a new Module to the Course Programme's list of modules
        //ensure that the new module is contained on the course's list of modules
        Module newModule = new Module("Software Engineering", "CT417");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        instance.addModule(newModule);
        
        assertTrue(instance.getListOfModules().contains(newModule));
    }
    
}
