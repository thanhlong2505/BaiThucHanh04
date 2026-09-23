package com.gdragon.whiteboxtesting;

public class DaysInMonth {

    public static int getDays(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be from 1 to 12.");
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
            return 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        return 31;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
