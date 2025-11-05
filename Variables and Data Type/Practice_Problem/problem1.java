/*
 Question1: In a program, input 3 numbers: A, B and C.You have to output the average of these 3 numbers.
 */

//05-11-2025

import java.util.*;

public class problem1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C)/3;

        System.out.println(average);
    }
    
}
