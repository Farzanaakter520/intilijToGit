package Class23;

public class Test {
    public static void main(String[] args) {
        Employees Rahul = new Employees();

        Rahul.Name = ("Rahul");
        Rahul.YearOfJoining = (1994);
        Rahul.Address = ("Tilak Nagar, New Delhi");

        Employees Raman = new Employees();

        Raman.Name = ("Raman");
        Raman.YearOfJoining = (2000);
        Raman.Address = ("Hari Nagar, New Delhi");

        Employees Rohit = new Employees();

        Rohit.Name = ("Rohit");
        Rohit.YearOfJoining = (1999);
        Rohit.Address = ("Subash Nagar, New Delhi");



        System.out.println("Name " + "  " + "YearOfJoining " + "    " + "Address ");
        System.out.println(Rahul.Name + "  " + Rahul.YearOfJoining + "              " + Rahul.Address);
        System.out.println(Raman.Name + "  " + Raman.YearOfJoining + "              " + Raman.Address);
        System.out.println(Rohit.Name + "  " + Rohit.YearOfJoining + "              " + Rohit.Address);

    }
}
