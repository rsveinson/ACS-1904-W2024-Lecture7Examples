import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
public class WritePrimitiveDataToXML {
    public static void main(String[] args)throws IOException{
        
      XMLEncoder encoder = new XMLEncoder(new FileOutputStream("myData.xml"));
      
      int[] myData = {5, 20, 30, 2, 7};
      
      for (int i=0; i<5; i++) 
          encoder.writeObject(myData[i]);
          
      //encoder.writeObject(myData);    
      encoder.close();
    }
}