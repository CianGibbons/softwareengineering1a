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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        System.out.println("Running JUnit Test for getName()");
        //Create an instance of Module using a specific name
        //use the getName() method to get the result of the method
        //ensure that the result yielded from the getName() method is the same as the original name of the module.
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        String expResult = nameOfModule;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Module.
     */
    @Test
    public void testGetId() {
        System.out.println("Running JUnit Test for getId()");
        //Create a Module using a specific ID
        //Use the getId() method to get the actual result of the method
        //Ensure that the actual result of the method is equal to the original Module ID
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        String expResult = idOfModule;
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListOfStudents method, of class Module.
     */
    @Test
    public void testGetListOfStudents() {
        System.out.println("Running JUnit Test for getListOfStudents()");
        //Create an instance of Module using the constructor that allows you to pass in a list of students
        //since we have the list that was passed into the constructor we can use this to compare with the result of getListOfStudents()
        
        ArrayList<Student> listOfStudents = new ArrayList<>();
        //{"Cian Gibbons","Jamie Larkin","Joe Ribbon"}
        listOfStudents.add(new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 )));
        listOfStudents.add(new Student("Jamie Larkin", new DateTime( 2001, 3, 11, 0, 0, 0 )));
        listOfStudents.add(new Student("Joe Ribbon", new DateTime( 2000, 12, 12, 0, 0, 0)));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( listOfStudents, nameOfModule, idOfModule );
        ArrayList<Student> expResult = listOfStudents;
        ArrayList<Student> result = instance.getListOfStudents();
        //Ensure both lists of students are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCoursesAssociated method, of class Module.
     */
    @Test
    public void testGetCoursesAssociated() {
        System.out.println("Running JUnit Test for getCoursesAssociated()");
        //Create an instance of Module using the constructor that allows you to pass in a list of courses associated
        //since we have the list that was passed into the constructor we can use this to compare with the result of getCoursesAssociated()
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<CourseProgramme> listOfCoursesAssociated = new ArrayList<>();
        listOfCoursesAssociated.add(new CourseProgramme( "BCT", academicStartDate, academicEndDate ));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule, listOfCoursesAssociated );
        ArrayList<CourseProgramme> expResult = listOfCoursesAssociated;
        ArrayList<CourseProgramme> result = instance.getCoursesAssociated();
        //Ensure both lists of courses are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        System.out.println("Running JUnit Test for setName()");
        //Create an instance of Module with a specific name
        //Overwrite the name of the Module with a new Name using the setName() method
        //Get the Name of the instance of the Module using getName() and ensure it is equal to the new Name
        String newName = "Computer Software Engineering 3";
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setName(newName);
        
        String expResult = newName;
        String result = instance.getName();
        //ensure results are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Module.
     */
    @Test
    public void testSetId() {
        System.out.println("Running JUnit Test for setId()");
        //Create an instance of Module with a specific ID
        //Overwrite the ID of the Module with a new ID using the setId() method
        //Get the ID of the instance of the Module using getId() and ensure it is equal to the new ID
        String newIdOfModule = "CT418";
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setId(newIdOfModule);
        
        String expResult = newIdOfModule;
        String result = instance.getId();
        //ensure results are equal
        assertEquals(expResult, result);
    }

    /**
     * Test of setListOfStudents method, of class Module.
     */
    @Test
    public void testSetListOfStudents() {
        System.out.println("Running JUnit Test for setListOfStudents");
        //Create an instance of Module
        //Set the Module's list of the Students using the setListOfStudents() method
        //Ensure that getListOfStudents returns this same list
        ArrayList<Student> listOfStudents = new ArrayList<>();
        //{"Cian Gibbons","Jamie Larkin","Joe Ribbon"}
        listOfStudents.add(new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 )));
        listOfStudents.add(new Student("Jamie Larkin", new DateTime( 2001, 3, 11, 0, 0, 0 )));
        listOfStudents.add(new Student("Joe Ribbon", new DateTime( 2000, 12, 12, 0, 0, 0)));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setListOfStudents(listOfStudents);
        
        ArrayList<Student> expResult = listOfStudents;
        ArrayList<Student> result = instance.getListOfStudents();
        //ensure that both lists are equal
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCoursesAssociated method, of class Module.
     */
    @Test
    public void testSetCoursesAssociated() {
        System.out.println("Running JUnit Test for setCoursesAssociated()");
        //Create an instance of Module
        //Set the Module's list of the Courses Associated using the setCoursesAssociated() method
        //Ensure that getCoursesAssociated() returns this same list
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<CourseProgramme> listOfCoursesAssociated = new ArrayList<>();
        listOfCoursesAssociated.add(new CourseProgramme( "BCT", academicStartDate, academicEndDate ));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setCoursesAssociated(listOfCoursesAssociated);
        
        ArrayList<CourseProgramme> expResult = listOfCoursesAssociated;
        ArrayList<CourseProgramme> result = instance.getCoursesAssociated();
        //ensure both lists are the same
        assertEquals(expResult, result);
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("Running JUnit Test for addStudent");
        //Create an instance of Module
        //Add a Student to the Module's list of Students
        Student student = new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 ));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.addStudent(student);
        
        //Ensure that the Module contains the student on its list of students
        assertTrue(instance.getListOfStudents().contains(student));
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        System.out.println("Running JUnit Test for addCourse");
        //Create an instance of Module
        //Add a Course to the Module's list of Courses
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme course = new CourseProgramme( "BCT", academicStartDate, academicEndDate );
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.addCourse(course);
        //Ensure that the Module contains the course on its list of courses
        assertTrue(instance.getCoursesAssociated().contains(course));
    }
       
}
