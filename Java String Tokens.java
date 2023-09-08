import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.

    scan.close();
    if (s.length()==0){
        System.out.println(0);
    } else {
        s = s.replaceAll("[^\\p{Alpha}]", " ").trim();
        if (s.length()==0){
            System.out.println(0);

        } else {
            String[] rs = s.split("[^a-zA-Z]+");
            System.out.println(rs.length);
            for(String e: rs){
                System.out.println(e);
            } 
        }

    }
}
}

