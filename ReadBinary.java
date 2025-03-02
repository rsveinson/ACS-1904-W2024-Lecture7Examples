import java.io.ObjectInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadBinary {
    public static void main(String[] args)throws IOException, ClassNotFoundException{

        int[] myData = new int[10];
        System.out.println(myData);
        DataInputStream  is = new DataInputStream(new FileInputStream("myData.ser"));
        // ObjectInputStream is = new ObjectInputStream( new FileInputStream("arrayOfInt.ser"));
        // myData = (int[]) is.readObject();
        // System.out.println(myData);

        // get values from file into array
        /* note if we try to read
         * more data than exist in the file
         * we get an EOFException,
         * that's end of file exception
         */
        // for (int i=0; i<5; i++){
        // myData[i] = is.readInt();
        // }// end for

        // // display values in array
        // for (int i: myData)
            // System.out.println(i);

        // using an eof loop (sort of)
        int count = 0;      // counter and indexer

        while(is.available() > 0){  // true means more bytes to read
            myData[count] = is.readInt();
            count++;            // another int read into the array
        }// end eof'ish

        // the problem with a for-each loop here
        // it will print the entire size of the array even
        // if it (the array) is only partially filled
        // for (int i: myData)
        // System.out.println(i);

        for(int i = 0; i < count; i++){
            System.out.println(myData[i]);
        }//end print list
        System.out.println(myData);  
        is.close();
    }
}
