package Class02;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your school");
        String school = sc.nextLine();

        System.out.println("Hi" + " " + name);
        System.out.println("Sum of the variable" + UserInput.sum());
        System.out.println("Sum of the variable is :" + UserInput.sum(587, 525));
        System.out.println(UserInput.printHi( name, age, school));
    }

    public static int sum() {
        int a = 2;
        int b = 5;

        return  a+b;
    }

    public static int sum( int a, int b){
        return a+b;
    }
    public static String printHi(String name, int age, String school){
        return "Hi" + name + " " + "!" + "You are" + " " + age + "years old. Your school name is:" + school;
    }

}
