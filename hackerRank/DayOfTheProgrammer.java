package hackerRank;




//Because 1918 removed 13 days from February, the date of the 256th day shifted from 12/13 Sept → to 26 Sept.

public class DayOfTheProgrammer {

    public static String dayOfProgrammer(int year) {
    // Write your code here
        if (year == 1918) {
        return "26.09.1918";
    }

    boolean isLeap;
    if (year < 1918) { // Julian
        isLeap = (year % 4 == 0);
    } else { // Gregorian
        isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    String day = isLeap ? "12" : "13";
    return day + ".09." + year;
    
    }

    public static void main(String[] args) {
        
    }
}

