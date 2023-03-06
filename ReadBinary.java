import java.io.ObjectInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadBinary {
   public static void main(String[] args)throws IOException, ClassNotFoundException{
       
      int[] myData = new int[5];
      System.out.println(myData);
      //DataInputStream  is = new DataInputStream(new FileInputStream("myData.ser"));
      ObjectInputStream is = new ObjectInputStream( new FileInputStream("arrayOfInt.ser"));
      myData = (int[]) is.readObject();
      System.out.println(myData);

      // get values from file into array
      //for (int i=0; i<5; i++) 
         //myData[i] = is.readInt();
         
      // display values in array
      for (int i: myData)
        System.out.println(i);
      System.out.println(myData);  
      is.close();
   }
}
