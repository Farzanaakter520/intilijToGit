package Class10;

public class Vehicle {
    private int numberOfDoor;
    private String engineBrand;
    private int seatNumber;

    public Vehicle() {
    }

    public Vehicle(int numberOfDoor, String engineBrand, int seatNumber) {
        this.numberOfDoor = numberOfDoor;
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}