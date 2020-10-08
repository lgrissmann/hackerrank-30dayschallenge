import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    // Add your code here
    Difference(int[] inteiros){
        elements = inteiros;
    }

    public int computeDifference(){
        maximumDifference = -10;
        for (int x : elements){
            for (int y : elements){
                int res = x - y;
                if ( res > maximumDifference) maximumDifference = res;
            }
        }
        return maximumDifference;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}