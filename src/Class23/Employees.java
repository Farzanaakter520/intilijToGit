package Class23;

public class Employees {
    String Name;
    int YearOfJoining;
    String Address;

    public Employees() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYearOfJoining() {
        return YearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        YearOfJoining = yearOfJoining;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    Employees(String Name, int YearOfMonth, String Address) {
        this.Name = Name;
        this.YearOfJoining = YearOfJoining;
        this.Address = Address;


    }

}
