import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PractitionersFromXML {
   public static void main(String[] args) throws IOException{
      // decoder object references the xml file
      XMLDecoder decoder = new XMLDecoder( new FileInputStream("practitioners.xml"));
      
      // The JVM only knows the object read as being of type Object.
      // Since we know the object being read is of type ArrayList 
      //    we include a cast to type ArrayList to the right of 
      //    the assignment operator.
      ArrayList<Practitioner> practitioners = (ArrayList) decoder.readObject();
      decoder.close();
      
      // display the practitioners, doctors, etc.
      for (Practitioner p: practitioners) {
         String type="practitioner";
         if (p instanceof Doctor) type="doctor";
         if (p instanceof Pharmacist) type="pharmacist";
         //System.out.println(type+" "+p.getFirstName());
      }
      
      System.out.println("\nend of program");
   }
}
