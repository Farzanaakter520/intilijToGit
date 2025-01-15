package Class30;

public class ContractEmployee extends Employee {

    public ContractEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void taxCalculator() {
        double tax = getSalary() * 0.05;
        if (getSalary() < 0) {
            throw new InvalidSalaryException("Exception");
        }
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
