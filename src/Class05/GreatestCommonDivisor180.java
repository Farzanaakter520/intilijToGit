package Class05;

import java.util.Scanner;

public class GreatestCommonDivisor180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gcn = 1;
        int k = 2;

        System.out.println("Enter 1st integer : ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd integer : ");
        int num2 = sc.nextInt();

        while (k<= num1 && k<= num2){
            if (num1 % k == 0 && num2 % k == 0)
                gcn = k;
            k++;
        }
        System.out.println("The greatest common divisor for " +num1 +" and "+ num2 +" is "+ gcn);

    }
}
