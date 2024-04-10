package test.fizzbuzz;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        int three = 3;
        int five = 5;
        for(int i=1;i<=n;i++){
            if(i%three==0 && i%five==0){
                System.out.println("FizzBuzz");
            }
            if(i%three==0 && i%five!=0){
                System.out.println("Fizz");
            }
            if(i%five==0 && i%three!=0){
                System.out.println("Buzz");
            }
            if(i%three!=0 && i%five!=0){
                System.out.println(i);
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter an int");/*had to took it out to work in hackerrank tests*/
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        Result result = new Result();
        result.fizzBuzz(d);
        scan.close();
    }
}