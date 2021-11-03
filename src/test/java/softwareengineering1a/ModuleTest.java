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
        System.out.println("getName");
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
        System.out.println("getId");
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
        System.out.println("getListOfStudents");
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCoursesAssociated method, of class Module.
     */
    @Test
    public void testGetCoursesAssociated() {
        System.out.println("getCoursesAssociated");
        
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Computer Software Engineering 3";
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setName(newName);
        
        String expResult = newName;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Module.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String newIdOfModule = "CT418";
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.setId(newIdOfModule);
        
        String expResult = newIdOfModule;
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListOfStudents method, of class Module.
     */
    @Test
    public void testSetListOfStudents() {
        System.out.println("setListOfStudents");
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCoursesAssociated method, of class Module.
     */
    @Test
    public void testSetCoursesAssociated() {
        System.out.println("setCoursesAssociated");
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
        assertEquals(expResult, result);
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 ));
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.addStudent(student);
        
        
        assertTrue(instance.getListOfStudents().contains(student));
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme course = new CourseProgramme( "BCT", academicStartDate, academicEndDate );
        String nameOfModule = "Software Engineering 3";
        String idOfModule = "CT417";
        Module instance = new Module( nameOfModule, idOfModule );
        instance.addCourse(course);
        assertTrue(instance.getCoursesAssociated().contains(course));
    }
       
}
