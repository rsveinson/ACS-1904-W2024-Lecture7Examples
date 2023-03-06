import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitiveDataFromXML {
    public static void main(String[] args)throws IOException{
      // decoder object references the XML file
      XMLDecoder decoder = new XMLDecoder(new FileInputStream("myData.xml"));
      
      // get the five int values
      int[] myData = new int[5];
      
      for (int i=0; i<5; i++) 
          myData[i] = (int) decoder.readObject();
          
      // display the array and close the file
      for (int i: myData)
          System.out.println(i);
          
      decoder.close();
    }
}