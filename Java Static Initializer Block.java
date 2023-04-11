import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static boolean flag;
private static int B,H;
private static Scanner scn; 
static {
    scn = new Scanner(System.in);
    B = scn.nextInt();
    H = scn.nextInt();
    try{
        if (B>0 && H>0) flag=true; 
        else throw new java.lang.Exception("Breadth and height must be positive");
    }
    catch(java.lang.Exception e){System.out.println(e.toString());}
}



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

