import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileOutputStream;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class RedirectOutputToFile{
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        // we know what this does
        System.out.println("1. to standard output");
        
        // create a PrintStream object
        PrintStream standard = System.out;
        
        /* *****
         * create a new file for output
         * if the file indicated already exists it 
         * is overwritten completely
         * ***** */
        File f = new File("exOutPut.txt");
        
        // create a new PrintStream and replace the standard output
        // note that the argument is the new file created above
        FileOutputStream fs = new FileOutputStream(f);
        
        // note the argument
        PrintStream ps = new PrintStream(fs);
        
        // read from the keyboard to pause execution so we can look at the file
        String strin = scanner.next();
        
        /* we can now print to the output stream
         * in the following manner
         */
        ps.println("print to the output file using the print stream.");
        
        /* or we can set the default output stream
         * to the new steam we just created
         */
        //System.setOut(ps);
        
        System.out.println("2. this should go to the file.");
        System.out.print("and this ");
        System.out.println("and also this. I'm not making things up, it really does overwrite.");
        
        // read from the keyboard to pause execution so we can look at the file 
        strin = scanner.next();
        ps.close();     // don't forget to close the file
        
        // and re-set output to standard
        System.setOut(standard);
        
        System.out.println("3. and back to the terminal window.");

        System.out.println("end of program");
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
