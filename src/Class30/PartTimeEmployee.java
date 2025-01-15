package Class30;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void  taxCalculator() {
        System.out.println("Do not pay");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "Name =" + getName()+
                ", Id =" + getId() +
                ", Salary =" + getSalary() +
                "}";
    }
}
