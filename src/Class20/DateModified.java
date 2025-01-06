package Class20;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateModified {
    public static <file> void main(String[] args) {
        File file1 = new File("C:\\JAVA\\JAVA CLASS\\JAVA CLASS\\src\\TenthClass");

        long time1 = file1.hashCode();

        DateFormat date = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

        System.out.println("Java modified date is : "
                + date.format(time1));
    }
}
