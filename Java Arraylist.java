import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            int d = sc.nextInt();
            tmp.add(d);
            for(int j = 0; j < d; j++){
                tmp.add(sc.nextInt());
            }
            arr.add(tmp);
        }
        
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int r = sc.nextInt() - 1;
            int c = sc.nextInt();
            if(r < n && c <= arr.get(r).get(0))
                System.out.println(arr.get(r).get(c));
            else System.out.println("ERROR!");
        }
    }
}
