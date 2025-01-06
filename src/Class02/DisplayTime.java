package Class02;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer a second");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;

        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " Seconds " + minutes + " Minutes and " + remainingSeconds + " Seconds");

    }
}
