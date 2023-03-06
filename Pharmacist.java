/**
 * The Pharmacist class
 * - a subclass of Practitioner
 * - a pharmacist "is a" practitioner
 */
public class Pharmacist extends Practitioner
{
    private String location;
    /**
     * by default, the no-arg constructor calls
     * the no-arg constructor in Practitioner
     */
    public Pharmacist()
    {
        location = "unknown";
    }

    /**
     * constructor for when information is available
     */
    public Pharmacist(String firstName, String lastName, String gender, String location)
    {
        // note the explicit call to a Practitioner constructor
        super(firstName, lastName, gender);
        this.location = location;
    }
    // getters
    public String getLocation(){
        return location;
    }    
    // setters
    public void setLocation(String location){
        this.location = location;
    }
}
