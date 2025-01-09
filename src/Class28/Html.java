package Class28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Html {
    public static void main(String[] args) {

        String filePath = "C:/Users/Java Student PC-8/Desktop/HTML/4thclass.html";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder content = new StringBuilder();


            while ((line = br.readLine()) != null) {
                line = line.replaceAll("<.*?>", "");
                content.append(line).append("\n");
            }

            System.out.println("Content without HTML tags:\n" + content.toString());
        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }
}
