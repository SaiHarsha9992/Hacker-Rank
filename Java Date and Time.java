import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance(); 
        cal.set(year, month-1, day );
        int dayId= cal.get(Calendar.DAY_OF_WEEK);
        String dayOfWeek ="";

        if (dayId == 1) {
            dayOfWeek = "SUNDAY";
        } else if (dayId == 2) {
            dayOfWeek = "MONDAY";
        } else if (dayId == 3) {
            dayOfWeek = "TUESDAY";
        } else if (dayId == 4) {
            dayOfWeek = "WEDNESDAY";
        } else if (dayId == 5) {
            dayOfWeek = "THURSDAY";
        } else if (dayId == 6) {
            dayOfWeek = "FRIDAY";
        } else if (dayId == 7) {
            dayOfWeek = "SATURDAY";
        }

        return dayOfWeek; 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
