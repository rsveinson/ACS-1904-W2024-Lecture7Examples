import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PractitionersToXML {
   public static void main(String[] args) throws IOException{
      // List of practitioners
      ArrayList<Practitioner> practitioners = new ArrayList();
      
      // Create some practitioners
      Practitioner pr = new Practitioner("Sam","Smith","female");
      Doctor       dr = new Doctor("Jill","Jones","female","Dermatology");
      Pharmacist   ph = new Pharmacist("Eddy","Edwards","male","Drugco");
      
      // add them to the array list
      practitioners.add(pr);
      practitioners.add(dr);
      practitioners.add(ph);
      
      // using the no-arg constructor
      //practitioners.add(new Doctor());
      
      // the encoder object references the file
      XMLEncoder  encoder = new XMLEncoder(new FileOutputStream("practitioners.xml"));
      
      // write out the practitioner object graph
      encoder.writeObject(practitioners);
      // encoder.writeObject(dr);
      // encoder.writeObject(dr.getGPa());
      System.out.println("object(s) written to file.");
      
      // close the xml file
      encoder.close();
      
      System.out.println("\nend of program");
   }
}
