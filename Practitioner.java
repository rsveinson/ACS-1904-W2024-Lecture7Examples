import java.io.Serializable;
public class Practitioner implements Serializable{
    private String firstName;
    private String lastName;
    private String gender;
    private double gpa;
    
    public Practitioner(){
        firstName = lastName = gender  = "unknown";
        gpa = 0.0;
    }
    
    public Practitioner(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.gender    = gender;
        gpa = 4.5;
    }
    
    public double getGPa(){
        return gpa;
    }
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String toString(){
        return getName()+" "+gender;
    }
    
    public String getName(){
        return firstName+" "+lastName;
    }
}
