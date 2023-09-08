import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

    int numberOfElements = sc.nextInt();
    int[] array = new int[numberOfElements];

    for (int i = 0; i < numberOfElements; i++) {
        array[i] = sc.nextInt();
    }

    sc.close();

    int subArrayLength = 1;
    int subArraySum = 0;
    int negativeSubArrayCount = 0;

    for (int i = 0; i < numberOfElements; i++) {

        for (int j = 0; j <= numberOfElements - subArrayLength; j++) {

            for (int k = j; k < j + subArrayLength; k++) {
                subArraySum += array[k];
            }

            if (subArraySum < 0) {
                negativeSubArrayCount++;
            }

            subArraySum = 0;

        }

            subArrayLength++;
    }

    System.out.println(negativeSubArrayCount);
    }
}