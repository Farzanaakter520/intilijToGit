package Class28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
        public static boolean isValidIPAddress(String ip) {

            String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

            String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

            Pattern p = Pattern.compile(regex);

            if (ip == null) {
                return false;
            }

            Matcher m = p.matcher(ip);

            return m.matches();
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter an IP address to validate:");

            String ipAddress = sc.nextLine();

            boolean isValid = isValidIPAddress(ipAddress);

            if (isValid) {
                System.out.println("The IP address " + ipAddress + " is valid.");
            } else {
                System.out.println("The IP address " + ipAddress + " is invalid.");
            }

            sc.close();
        }
    }
