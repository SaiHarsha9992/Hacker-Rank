import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner ( System . in ) ;
       int n = s . nextInt () ; 
       for ( int i = 1 ; i < 11 ; i++ )
       {
          int t = n * i ;  
          System . out . println ( n+" "+"x"+" "+i+" "+"="+" "+t ) ;
       }
        System.out.println();
   }
}
