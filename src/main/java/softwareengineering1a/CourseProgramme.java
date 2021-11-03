/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareengineering1a;
import org.joda.time.DateTime; // import the Joda Time Package
import java.util.ArrayList; // import the ArrayList class
/**
 *
 * @author ciangibbons
 */
public class CourseProgramme {
    //course name (CS & IT or ECE, etc.), list of modules, list of students that are enrolled, academic start date and end date.
    //Private Members
    private String name;
    private ArrayList<Module> listOfModules = new ArrayList<>();
    private ArrayList<Student> listOfStudents = new ArrayList<>();
    private DateTime academicStartDate;
    private DateTime academicEndDate;

    //Constructors
    // Note: Multiple Constructors not required but were made in order to adequately test all methods in the JUnit Tests
    public CourseProgramme(String name, DateTime academicStartDate, DateTime academicEndDate) {
        this.name = name;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }
    
    public CourseProgramme(String name, DateTime academicStartDate, DateTime academicEndDate, ArrayList<Module> listOfModules ) {
        this.name = name;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
        this.listOfModules = listOfModules;
    }
    
    public CourseProgramme(ArrayList<Student> listOfStudents, String name, DateTime academicStartDate, DateTime academicEndDate ) {
        this.name = name;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
        this.listOfStudents = listOfStudents;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public ArrayList<Module> getListOfModules() {
        return this.listOfModules;
    }

    public ArrayList<Student> getListOfStudents() {
        return this.listOfStudents;
    }

    public DateTime getAcademicStartDate() {
        return this.academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return this.academicEndDate;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }
    
    //Update Lists
    public void addStudent(Student student){
        // Add student to the List of Students in this Course Programme
        this.listOfStudents.add( student );
        // If the Student doesnt have this course on its list of courses add this course to its list of courses
        if(!student.getCourses().contains(this)){
            student.addCourse(this);
        }
    }
    
    public void addModule(Module module){
        // Add Module to the List of Modules in this Course
        this.listOfModules.add( module );
        // If the Modules doesn't have this course on its list of courses associated, then add this course to the list of the modules courses associated
        if(!module.getCoursesAssociated().contains(this)){
            module.addCourse(this);
        }
    }
    
    @Override
    public String toString() {
        String returnString =  "Course Name: " + this.getName() 
                + "\tAcademic Start Date: " + this.getAcademicStartDate() 
                + "\tAcademic End Date: " + this.getAcademicEndDate() + "\nModules: \n";
        for(int i = 0; i < this.getListOfModules().size(); i++){
            returnString += this.getListOfModules().get(i).getName() + "\t" + this.getListOfModules().get(i).getId() + "\n";
        }
        
        returnString += "Students: \n";
        for(int i = 0; i < this.getListOfStudents().size(); i++){
            returnString += this.getListOfStudents().get(i).getName() + "\t" + this.getListOfStudents().get(i).getId() + "\n";
        }
               
        return returnString;
    }
}
