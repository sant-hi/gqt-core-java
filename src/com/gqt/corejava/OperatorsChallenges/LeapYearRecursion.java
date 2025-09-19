package Operators;

public class LeapYearRecursion {
	public static boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static void checkLeap(int year) {
        if (isLeap(year))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    public static void main(String[] args) {
        int year = 2024;
        checkLeap(year);
    }
}
