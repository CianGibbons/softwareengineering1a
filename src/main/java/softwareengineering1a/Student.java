/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareengineering1a;
import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author ciangibbons
 */
public class Student {
    //Statics
    private static int numberOfStudents = 0;
    
    //Name, Age, DOB, ID, username, courses and modules registered for
    //Private Members
    private String name;
    private String username;
    private int age = -1;
    private int id;
    private DateTime dob;
    private ArrayList<CourseProgramme> listOfCourses = new ArrayList<>();
    private ArrayList<Module> listOfModules = new ArrayList<>();

    //Constructor
    // Note: Multiple Constructors not required but were made in order to adequately test all methods in the JUnit Tests
    public Student(String name, DateTime dob) {
        this.name = name;
        this.dob = dob;
        
        Student.numberOfStudents++;
        this.id = Student.numberOfStudents;
    }
    
    public Student(String name, DateTime dob, ArrayList<CourseProgramme> listOfCourses ) {
        this.name = name;
        this.dob = dob;
        this.listOfCourses = listOfCourses;
        
        Student.numberOfStudents++;
        this.id = Student.numberOfStudents;
    }
    
    public Student( ArrayList<Module> listOfModules, String name, DateTime dob ) {
        this.name = name;
        this.dob = dob;
        this.listOfModules = listOfModules;
        
        Student.numberOfStudents++;
        this.id = Student.numberOfStudents;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public String getUsername() {
        // Usernames are constructed by concatonating a students name and age.
        if( this.username == null ){
            this.setUsername( this.getName() + this.getAge());
        }
        return this.username;
    }

    public int getAge() {
        // if the age of the student is not yet set, i.e. is equal to -1
        if( this.age == -1 ){
            //Calculating the the Period of time in Years between the Students Date of Birth and the date now
            DateTime now = DateTime.now();
            this.age = new Period(this.getDob(), now).getYears();
        }
        return this.age;
    }

    public DateTime getDob() {
        return this.dob;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return this.listOfCourses;
    }

    public ArrayList<Module> getModules() {
        return this.listOfModules;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.listOfCourses = courses;
    }

    public void setModules(ArrayList<Module> modules) {
        this.listOfModules = modules;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    //Static Getter
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    //Static Setter
    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
    }

    //Update Lists
    public void addModule(Module module){
        // Add the module to the Students list of Modules
        this.listOfModules.add( module );
        // If the Student hasn't yet been added to the Modules list of students then add the student to the modules list of students
        if(!module.getListOfStudents().contains(this)){
            module.addStudent(this);
        }
    }
    
    public void addCourse(CourseProgramme course){
        // Add the course to the students list of courses
        this.listOfCourses.add( course );
        // if the students has not been added to the courses list of students then add the student to the courses list of students
        if(!course.getListOfStudents().contains(this)){
            course.addStudent(this);
        }
        
    }
    
      @Override
    public String toString() {
        String returnString =  "Student Name: " + this.getName() 
                + "\tStudent ID: " + this.getId()
                + "\tStudent Username: " + this.getUsername()
                + "\nStudent Age: " + this.getAge()
                + "\tStudent DOB: " + this.getDob() + "\n";
       
        returnString += "Courses: \n";
        for(int i = 0; i < this.getCourses().size(); i++){
            returnString += this.getCourses().get(i).getName() + "\n";
        }
        
        returnString += "Modules: \n";
        for(int i = 0; i < this.getModules().size(); i++){
            returnString += this.getModules().get(i).getName() + "\t" + this.getModules().get(i).getId() + "\n";
        }
        
        return returnString;
    }
}
