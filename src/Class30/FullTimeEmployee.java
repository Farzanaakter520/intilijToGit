package Class30;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }


    public FullTimeEmployee() {
        super();
    }


    @Override
    public void  taxCalculator() throws InvalidSalaryException {
        double tax = getSalary() * 0.025;
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

