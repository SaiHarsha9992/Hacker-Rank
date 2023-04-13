import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println (A.length()+B.length());
        if ( A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        A=A.replace(A.charAt(0),(char)(A.charAt(0)-32));
        B=B.replace(B.charAt(0),(char)(B.charAt(0)-32));
        System.out.print(A+" "+B);
    
    }
}



