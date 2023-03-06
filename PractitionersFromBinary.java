import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PractitionersFromBinary {
   public static void main(String[] args) throws IOException, ClassNotFoundException{
       
      ObjectInputStream is = new ObjectInputStream( new FileInputStream("practitioners.ser"));
      // The JVM only knows the object read as being of type Object.
      // Since we know the object being read is of type ArrayList 
      //    we include a cast to type ArrayList to the right of 
      //    the assignment operator.
      ArrayList<Practitioner> practitioners = (ArrayList) is.readObject();
      
      is.close();       // release this resource
      
      for (Practitioner p: practitioners) {
         String type="practitioner";
         if (p instanceof Doctor) type="doctor";
         if (p instanceof Pharmacist) type="pharmacist";
         //System.out.println(type+" "+p.getFirstName());
      }
      
      System.out.println("\nend of program");
   }
}
