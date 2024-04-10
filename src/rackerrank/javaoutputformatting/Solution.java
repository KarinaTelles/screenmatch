package rackerrank.javaoutputformatting;

import java.util.Scanner;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String formatString = "%-15s%03d%n";
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf(formatString, s1, x);

        }
        System.out.println("================================");

    }
}
