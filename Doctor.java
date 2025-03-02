/**
 * The Doctor class
 * - a subclass of Practitioner
 * - an instructor "is a" practitioner
 */
public class Doctor extends Practitioner {
    private String specialty;
    /**
     * no-arg constructor, recall default call 
     * to Practitioner no-arg constructor
     */
    public Doctor()
    {
        specialty = "unknown";
    }
    /**
     * constructor with firstname etc
     */
    public Doctor(String firstName, String lastName, String gender, String specialty)     {
        // note call to superclass constructor
        super(firstName, lastName, gender);
        this.specialty = specialty;
    }
    public String getSpecialty(){
        return specialty;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    public String getName(){
        //return "Dr. "+getFirstName()+" "+getLastName()+", "+getSpecialty();
        return "name";
    }
}
