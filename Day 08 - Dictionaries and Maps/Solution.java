//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> phonebook = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }

        
        while(in.hasNext()){
            String s = in.next();
            Integer find = phonebook.get(s);
            if (find != null) {
                System.out.println(s + "=" + find);
            } else {
                System.out.println("Not found");
            }

            
        }
        in.close();
    }
}