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
        System.out.println("getName");
        String courseName = "BCT";
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        String expResult = courseName;
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getListOfModules method, of class CourseProgramme.
     */
    @Test
    public void testGetListOfModules() {
        System.out.println("getListOfModules");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<Module> listOfModules = new ArrayList<>();
        listOfModules.add(new Module("Software Engineering 3","CT417"));
        
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate, listOfModules );
        
        ArrayList<Module> expResult = listOfModules;
        ArrayList<Module> result = instance.getListOfModules();
        
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getListOfStudents method, of class CourseProgramme.
     */
    @Test
    public void testGetListOfStudents() {
        System.out.println("getListOfStudents");
        String courseName = "BCT";
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
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicStartDate() {
        System.out.println("getAcademicStartDate");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime expResult = academicStartDate;
        DateTime result = instance.getAcademicStartDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicEndDate() {
        System.out.println("getAcademicEndDate");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        DateTime expResult = academicEndDate;
        DateTime result = instance.getAcademicEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CourseProgramme.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String currentCourseName = "BCT";
        String newCourseName = "BACT";
        
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( currentCourseName, academicStartDate, academicEndDate );
        
        
        instance.setName(newCourseName);
        
        String expResult = newCourseName;
        String result = instance.getName();
        assertEquals( expResult, result );
    }

    /**
     * Test of setListOfModules method, of class CourseProgramme.
     */
    @Test
    public void testSetListOfModules() {
        System.out.println("setListOfModules");
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
        assertEquals( expResult, result );
        
    }

    /**
     * Test of setListOfStudents method, of class CourseProgramme.
     */
    @Test
    public void testSetListOfStudents() {
        System.out.println("setListOfStudents");
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
        assertEquals( expResult, result );
    }

    /**
     * Test of setAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicStartDate() {
        System.out.println("setAcademicStartDate");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime newAcademicStartDate = new DateTime( 2022, 9, 6, 9, 0, 0);
        instance.setAcademicStartDate(newAcademicStartDate);
        
        DateTime expResult = newAcademicStartDate;
        DateTime result = instance.getAcademicStartDate();
        assertEquals( expResult, result );
    }

    /**
     * Test of setAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicEndDate() {
        System.out.println("setAcademicEndDate");
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        
        DateTime newAcademicEndDate = new DateTime( 2023, 5, 31, 6, 0, 0);
        instance.setAcademicEndDate(newAcademicEndDate);
       
        
        DateTime expResult = newAcademicEndDate;
        DateTime result = instance.getAcademicEndDate();
        assertEquals( expResult, result );
    }

    /**
     * Test of addStudent method, of class CourseProgramme.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student newStudent = new Student("Cian Gibbons", new DateTime( 2000, 1, 21, 0, 0, 0 ));
        String courseName = "BCT";
        //Create Joda DateTime objects with ints for year, month, day, hour, minutes, seconds
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        CourseProgramme instance = new CourseProgramme( courseName, academicStartDate, academicEndDate );
        instance.addStudent(newStudent);
        
        assertTrue(instance.getListOfStudents().contains(newStudent));
    }

    /**
     * Test of addModule method, of class CourseProgramme.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
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
