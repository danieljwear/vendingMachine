/*package VendMachine;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
   public static void main(String[] args) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      try {
         File file = new File("transactions/myfile.txt");
  

         if(file.createNewFile())System.out.println("System.out.println(timestamp);");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
}*/