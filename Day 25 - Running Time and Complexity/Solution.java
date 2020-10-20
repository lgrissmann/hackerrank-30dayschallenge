import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in); 
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int loop = 1; loop <= T; loop++){
            
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            boolean isPrime = true;
            if (n == 1) isPrime = false;
            
            if (n > 2 ) {
                for (int d = 2 ; d <= Math.sqrt(n) && isPrime; d++){
                    if ((n % d) == 0){
                        isPrime = false;
                    }
                }
                //System.out.println(n + " Prime: " + isPrime);
            }    

            if (isPrime) 
                System.out.println("Prime");
            else 
                System.out.println("Not prime");
        }
        scanner.close();
    }
}