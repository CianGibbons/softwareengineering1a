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
        System.out.println("getName");
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        String expResult = name;
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        
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
        System.out.println("getUsername");
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        int age = new Period(dob, DateTime.now()).getYears();
        
        String expResult = name + age;
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        int expResult = new Period(dob, DateTime.now()).getYears();
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        DateTime expResult = dob;
        DateTime result = instance.getDob();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        
        DateTime academicStartDate = new DateTime( 2021, 9, 6, 9, 0, 0);
        DateTime academicEndDate = new DateTime( 2022, 5, 31, 6, 0, 0);
        ArrayList<CourseProgramme> listOfCourses = new ArrayList<>();
        listOfCourses.add(new CourseProgramme("BCT", academicStartDate, academicEndDate ));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob, listOfCourses );
        
        ArrayList<CourseProgramme> expResult = listOfCourses;
        ArrayList<CourseProgramme> result = instance.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        
        ArrayList<Module> listOfModules = new ArrayList<>();
        listOfModules.add(new Module("Software Engineering", "CT417"));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( listOfModules, name, dob );
        
        ArrayList<Module> expResult = listOfModules;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
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
        System.out.println("setUsername");
        String username = "cgibbons21";
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setUsername(username);
        
        String expResult = username;
        String result = instance.getUsername();
        assertEquals( expResult, result );
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 18;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setAge(age);
        
        int expResult = age;
        int result = instance.getAge();
        assertEquals( expResult, result );
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        DateTime newDOB = new DateTime(2003, 1, 21 ,0 , 0 , 0 );;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setDob(newDOB);
        
        DateTime expResult = newDOB;
        DateTime result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        
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
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("Software Engineering", "CT417"));
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setModules(modules);
        ArrayList<Module> expResult = modules;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int newID = 18325633;
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 ,0 , 0 , 0 );
        Student instance = new Student( name, dob );
        
        instance.setId(newID);
        int expResult = newID;
        int result = instance.getId();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfStudents method, of class Student.
     */
    @Test
    public void testGetNumberOfStudents() {
        System.out.println("getNumberOfStudents");
        int expResult = Student.getNumberOfStudents() + 1;
        System.out.println("# Students Before Creating: " + Student.getNumberOfStudents());
        
        
        
        String name = "Cian Gibbons";
        DateTime dob = new DateTime(2000, 1, 21 , 0 , 0 , 0 );
        new Student( name, dob );
        System.out.println("# Students After: " + Student.getNumberOfStudents());
        
        int result = Student.getNumberOfStudents();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumberOfStudents method, of class Student.
     */
    @Test
    public void testSetNumberOfStudents() {
        System.out.println("setNumberOfStudents");
        int numberOfStudents = 2000;
        Student.setNumberOfStudents(numberOfStudents);
        
        int expResult = numberOfStudents;
        int result = Student.getNumberOfStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
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
        System.out.println("addCourse");
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
