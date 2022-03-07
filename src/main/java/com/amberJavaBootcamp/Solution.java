package com.amberJavaBootcamp;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;


 class Result {

     /*
     * Complete the 'addNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. FLOAT a
     *  2. FLOAT b
     */


        public static int addNumbers(float a, float b) {
            int intAddNumbers = (int) ((int) a) + ((int) b);

            return (int) Math.floor(intAddNumbers);
        }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        float a = Float.parseFloat(bufferedReader.readLine().trim());

        float b = Float.parseFloat(bufferedReader.readLine().trim());

        int result = Result.addNumbers(a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
};
