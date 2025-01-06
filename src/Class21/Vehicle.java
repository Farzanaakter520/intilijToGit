package Class21;

public class Vehicle {
    void speedup(){
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle Vehicle = new Vehicle();
        Vehicle Vr = new Car();
        Vehicle Vrr = new Bicycle();

        System.out.println(Vehicle instanceof Vehicle );
        System.out.println(Vehicle instanceof Car );
        System.out.println(Vehicle instanceof Bicycle );
    }
}
