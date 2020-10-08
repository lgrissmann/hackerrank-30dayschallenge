import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int nTests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < nTests; i++){

            String str = scanner.nextLine();
            int tam = str.length();
            char[] arrStr = str.toCharArray();

            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            for(int j = 0; j < tam; j++){
                if ( (j == 0) || (j % 2 == 0) ){
                    first.append(arrStr[j]);
                } else {
                    second.append(arrStr[j]);
                }
            }
            System.out.println(first.toString().trim() + " " + second.toString().trim());
        }
    }
}