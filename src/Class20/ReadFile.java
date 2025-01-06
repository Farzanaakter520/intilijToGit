package Class20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        //File file1 = new File("C:\\JAVA\\JAVA CLASS\\JAVA CLASS\\src\\TenthClass\\interfaceTest");

        //Scanner scanner = new Scanner(new FileReader("file1.txt"));

        //Scanner sc = new Scanner(file1);
       // while(sc.hasNextLine()){
       //     System.out.println(sc.nextLine());
       // }

        File file = new File("C:\\\\JAVA\\\\JAVA CLASS\\\\JAVA CLASS\\\\src\\\\TenthClass\\\\interfaceTest");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
