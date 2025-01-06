package Class02;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a degree : ");

        double celsius= sc.nextDouble();

        double fahrenheit  = ((celsius * 9/5) + 32);
        System.out.println("celsius is " + celsius + "fahrenheit is " + fahrenheit);
    }
}
