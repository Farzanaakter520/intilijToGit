package Class03;

public class StringFunction {
    public static void main(String[] args) {
        String name = "Bangladesh ia a beautifull country";
        String nameTwo = "\t\t\t\nWho are you\n\n\t";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.concat("add plus"));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        //System.out.println(anotherName.isEmpty());
        System.out.println(name.endsWith("de"));
        System.out.println(name.indexOf("B"));
        System.out.println(name.contains("h"));


        String nahid = "human";
        String hemel = "human";

        System.out.println(nahid.equals(hemel));
        System.out.println(nahid.equalsIgnoreCase(hemel));

        //System.out.println("This value is of type integer "
                            //+(Integer.valueOf(convertedFromString) instanceof integer));


        String numString = "22";
        int convertedFromString = Integer.parseInt(numString);
        System.out.println(convertedFromString);

        System.out.println(nameTwo.length());
        System.out.println(nameTwo.trim().length());

        System.out.println(nameTwo.substring(3));
        System.out.println(nameTwo.substring(3,7));




    }
}
