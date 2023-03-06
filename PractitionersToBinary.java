import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PractitionersToBinary {
   public static void main(String[] args) throws IOException {
      // List of practitioners
      ArrayList<Practitioner> practitioners = new ArrayList();
      
      // Create some practitioners
      Practitioner pr = new Practitioner("Sam","Smith","female");
      Doctor       dr = new Doctor("Jill","Jones","female","Dermatology");
      Pharmacist   ph = new Pharmacist("Eddy","Edwards","male","Drugco");
      
      practitioners.add(pr);
      practitioners.add(dr);
      practitioners.add(ph);
      
      // create an object to reference practitioners.ser
      ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("practitioners.ser"));
      
      // write out the object grapsh
      // that begins with the ArrayList
      os.writeObject(practitioners);
      System.out.println("object(s) written to file.");
      os.close();
      
      
      System.out.println("end of program");
   }
}
