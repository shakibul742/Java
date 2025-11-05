/*
 Question2: In a program, input the side of a square. You have to output the area of the square.
 */

//05-11-2025

import java.util.*;

public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = a * a;

        System.out.println(area);

        sc.close();
    }
}
