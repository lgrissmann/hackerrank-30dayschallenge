import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            
            Scanner scanner = new Scanner(System.in); 
            String returned = scanner.nextLine();
            String expected = scanner.nextLine();
            scanner.close();

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date dtReturned = sdf.parse(returned);
            Date dtExpected = sdf.parse(expected);
           
            Calendar calReturned = new GregorianCalendar();
            calReturned.setTime(dtReturned);

            Calendar calExpected = new GregorianCalendar();
            calExpected.setTime(dtExpected);

            int fine = 0;
            if (calReturned.after(calExpected)){

                if (calReturned.get(Calendar.YEAR) <= calExpected.get(Calendar.YEAR)) {

                    if (calReturned.get(Calendar.MONTH) <= calExpected.get(Calendar.MONTH)){
                        int n = calReturned.get(Calendar.DAY_OF_MONTH) - calExpected.get(Calendar.DAY_OF_MONTH);                        
                        fine = 15 * n;
                    } else {
                        int n = calReturned.get(Calendar.MONTH) - calExpected.get(Calendar.MONTH);                        
                        fine = 500 * n;
                    }
                } else {
                    fine = 10000;
                }            
            } 

            System.out.println(fine);
        } catch (Exception e){}
    }
}