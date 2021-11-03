/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareengineering1a;
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author ciangibbons
 */
public class Module {
    //module name, id (e.g. CT417), list of students, courses it is associated with
    //Private Members
    private String name;
    private String id;
    private ArrayList<Student> listOfStudents = new ArrayList<>();
    private ArrayList<CourseProgramme> listOfCoursesAssociated = new ArrayList<>();

    //Constructors
   // Note: Multiple Constructors not required but were made in order to adequately test all methods in the JUnit Tests
     public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Module( ArrayList<Student> listOfStudents, String name, String id ) {
        this.name = name;
        this.id = id;
        this.listOfStudents = listOfStudents;
    }
    
    public Module( String name, String id, ArrayList<CourseProgramme> listOfCoursesAssociated ) {
        this.name = name;
        this.id = id;
        for(int i = 0; i < listOfCoursesAssociated.size(); i++){
            this.addCourse(listOfCoursesAssociated.get(i));
        }
    }
    
    //Getters
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public ArrayList<Student> getListOfStudents() {
        return this.listOfStudents;
    }

    public ArrayList<CourseProgramme> getCoursesAssociated() {
        return this.listOfCoursesAssociated;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void setCoursesAssociated(ArrayList<CourseProgramme> coursesAssociated) {
        this.listOfCoursesAssociated = coursesAssociated;
    }
    
    //Update Lists
    public void addStudent(Student student){
        //Add student to the list of students signed up to this module
        this.listOfStudents.add( student );
        // if the student doesnt contain this module on its list of moduels then add this module to the student's list of modules
        if(!student.getModules().contains(this)){
            student.addModule(this);
        }
        
    }
    
    public final void addCourse(CourseProgramme course){
        // Add course to the list of courses associated with this module
        this.listOfCoursesAssociated.add( course );
        // if the course doesnt contain this module on its list of modules then add this module to the course's list of modules
        if(!course.getListOfModules().contains(this)){
            course.addModule(this);
        }
    }
    
    @Override
    public String toString() {
        String returnString =  "Module Name: " + this.getName() 
                + "\tModule ID: " + this.getId();
       
        returnString += "\nStudents: \n";
        for(int i = 0; i < this.getListOfStudents().size(); i++){
            returnString += this.getListOfStudents().get(i).getName() + "\t" + this.getListOfStudents().get(i).getId() + "\n";
        }
        
        returnString += "Courses Associated: \n";
        for(int i = 0; i < this.getCoursesAssociated().size(); i++){
            returnString += this.getCoursesAssociated().get(i).getName() + "\n";
        }
               
        return returnString;
    }
}
