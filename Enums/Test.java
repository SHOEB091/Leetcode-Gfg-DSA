package Enums;

public class Test {
    //Enum (short for Enumeration) is a special type in Java that represents a fixed set of constants — things that don’t change.
    /*
     Example:
    Days of the week (MONDAY, TUESDAY, …)
    Directions (NORTH, SOUTH, EAST, WEST)
    Seasons (SUMMER, WINTER, etc.)
     */

     enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
    }


}
