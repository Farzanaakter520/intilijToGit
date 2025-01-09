package Exception;

import java.util.Objects;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();

        try {
            validateUsername(username);
            validatePassword(password);
            System.out.println("Hello  " + username);
        } catch (customException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void validateUsername(String username) {
        String actualUsername = "Farzana";
        if (!Objects.equals(username, actualUsername)) {
            throw new customException("Incorrect username!");
        }
    }

    private static void validatePassword(String password) {
        String actualPassword = "nilu1234";
        if (!Objects.equals(password, actualPassword)) {
            throw new customException("Incorrect password!");
        }
    }

    public static class customException extends RuntimeException {
        public customException(String message) {
            super(message);
        }
    }
}

