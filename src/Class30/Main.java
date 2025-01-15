package Class30;

import Class29.BankAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <PrintWriterWriter> void main(String[] args) throws FileNotFoundException {
        List<Employee> employees = new ArrayList<>();

        //FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        //PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        //ContractEmployee contractEmployee = new ContractEmployee();

        try {
            File file = new File("C:\\JAVA\\JAVA CLASS\\IntelliJToGit\\src\\employee.CSV");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

            String [] data = sc.nextLine().split(",");
            String name = data[0].trim();
            int id = Integer.parseInt(data[1].trim());
            double salary = Double.parseDouble(data[2].trim());
            String type = data[3].trim();

            if(type.equalsIgnoreCase("FullTime")){
                employees.add(new FullTimeEmployee(name,id,salary));
            } else if (type.equalsIgnoreCase("PartTime")) {
                employees.add(new PartTimeEmployee(name,id,salary));
            } else if (type.equalsIgnoreCase("Contact")) {
                employees.add(new ContractEmployee(name,id,salary));
            }
            }
            sc.close();
        }catch(InvalidSalaryException | FileNotFoundException e){
            System.out.println("Error ");
        }


        try {
            PrintWriter writer = new PrintWriter("C:\\JAVA\\JAVA CLASS\\IntelliJToGit\\src\\Class30\\Employees.csv");
           for(Employee employee : employees){
               employee.setId(300);
               writer.println(employee);
           }

           writer.close();
        }catch(IOException e) {
        System.out.println("Exception");
        }

    }
}
