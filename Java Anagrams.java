import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    a = a.toLowerCase(); b = b.toLowerCase();

    while(a.length() == b.length() && a.length()!=0){
      char[] s = a.toCharArray();
    char[] s1 = b.toCharArray();

    java.util.Arrays.sort(s);
    java.util.Arrays.sort(s1);

    if(java.util.Arrays.equals(s,s1)){
        return true;
    }
    return false;  
    }
    return false;
    }
    public static void main(String[] args) {