import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int max = 0;
        int max1 = max;
        List<Integer> binario = new ArrayList<>();
        while (n > 0){
            int resto = n % 2;
            n = n / 2;
            if (resto == 1) 
                max++;
            else
                max = 0;

            if (max1 < max) max1 = max;
        }
        scanner.close();

        System.out.println(max1);
    }
}
