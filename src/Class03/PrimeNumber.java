package Class03;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int prime = sc.nextInt();
        sc.nextLine();


        if (prime <= 1) {
            System.out.println("This number is not prime.");
        } else {
            boolean isPrime = true;


            for (int i = 2; i * i <= prime; i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                System.out.println("This number is prime.");
            } else {
                System.out.println("This number is not prime.");
            }
        }
    }
}
