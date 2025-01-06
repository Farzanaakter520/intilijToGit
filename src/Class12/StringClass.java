package Class12;

public class StringClass {
    public static void main(String[] args) {
        String s = new String("This is a string");
        String s1 = "This is a string";

        String s2 = "Welcome to java";
        String s3 = new String("Welcome to java");
        String s4 = "Welcome to java";

        s2 = "Changed test";

        System.out.println("s2 == s3 is 🎀 " + (s2 == s3));
        System.out.println("s2 == s4 is 🎀 " + (s2 == s4));

        System.out.println("s2 == s3 is 🎀 " + (s2.equals(s3)));
        System.out.println("s2 == s4 is 🎀 " + (s2.equals(s4)));
    }
}
