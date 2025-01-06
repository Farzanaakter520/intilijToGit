package Class20;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file1 = new File("C:\\JAVA\\JAVA CLASS\\JAVA CLASS\\src\\TenthClass");

        System.out.println("The file has " + file1.length() + " bytes");
        System.out.println("The file has " + file1.length()/1024 + " KB");
        System.out.println("The file has " + file1.length()/(1024*1024) + " MB");
    }
}
