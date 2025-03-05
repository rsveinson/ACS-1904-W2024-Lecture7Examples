import java.io.ObjectOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinary {
   public static void main(String[] args)throws IOException {
       
      int[] myData = {5, 20, 30, 2, 7};
      
      DataOutputStream  os = new DataOutputStream(new FileOutputStream("myData.ser"));
      // create an object to reference a new file with an array writtenW
      //ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("arrayOfInt.ser"));
      //os.writeObject(myData);
      
      for (int i=0; i<5; i++) 
        os.writeInt(myData[i]);
    
    /* write a byte to the data file
     * so now there's a bunch of ints
     * each taking up 4 bytes of space followed
     * by one byte taking up one byte
     */
    byte b = (byte)155;
    os.writeByte(b);
       
      os.close();
      
      // closing
      System.out.println("end of program");
   }
}
