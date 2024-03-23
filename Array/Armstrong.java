package IntroToJava;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt();

        
        System.out.println(isArmstorng(number));
        
    }

    public static boolean isArmstorng(int n) {
        int noOfDigits = countOfDigits(n);
        int tempNumber = n;
        int remainder,result = 0;

        while(tempNumber!=0){

            remainder = tempNumber % 10;
            result+= Math.pow(remainder,noOfDigits);
            tempNumber/=10;
        }

        return result == n;


    }

    public static int countOfDigits(int n) {
        int count=0;

        while(n!=0){
            count++;
            n/=10;
        }

        return count;
    }
}
