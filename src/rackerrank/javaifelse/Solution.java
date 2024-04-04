package rackerrank.javaifelse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public void printWeird(int n){
        int x = 2;
        if(n%x!=0){
            System.out.println("Weird");
        }
        if(n%x==0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        if(n%x==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }
        if(n%x==0 && n>20){
            System.out.println("Not Weird");
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an int");/*had to took it out to work in hackerrank tests*/
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Solution solution = new Solution();
        solution.printWeird(N);
        scanner.close();
    }
}