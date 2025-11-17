// Prime number of not in java

import java.util.*;

public class java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i;

        boolean prime = true;

        if(num <= 1) prime = false;
        else{
            for(i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0){
                    prime = false;
                    break;
                }
            }

            if(prime)
            System.out.println(num + " Prime number");
            else System.out.println(num + " Not prime number");

            sc.close();
        }
    }
}