/*
Question 4: What will be the type of result in the following Java code?
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;

result = (f * b) + (i % c) - (d * s);

*/

//05-11-2025

import java.util.*;

public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        float part1 = (f * b);
        System.out.println("Part1 (f * b) = " +part1);

        int part2 = (i % c);
        System.out.println("Part2 (i % c) = " +part2);

        double part3 = (d * s);
        System.out.println("Part3 (d * s) = " +part3);

        double result = 0;
        result = part1 + part2 - part3;
        System.out.println("Final Result is Double that is : " +result);
    }
}

// Finally, result data type is double.....
