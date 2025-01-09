package Inheritance;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Orange orange = new Orange();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        McIntosh mcIntosh = new McIntosh();


        System.out.println("a. Fruit InstanceOf Fruit is " + (fruit instanceof Fruit));
        System.out.println("b. Fruit InstanceOf Orange is " + (fruit instanceof Orange));
        System.out.println("c. Fruit InstanceOf Apple is " + (fruit instanceof Apple));
        System.out.println("d. Fruit InstanceOf GoldenDelicious is " + (fruit instanceof GoldenDelicious));
        System.out.println("e. Fruit InstanceOf McIntosh is " + (fruit instanceof McIntosh));
        System.out.println("f. Orange InstanceOf Orange is " + (orange instanceof Orange));
        System.out.println("g. Orange InstanceOf Fruit is " + (orange instanceof Fruit));

    }
}
