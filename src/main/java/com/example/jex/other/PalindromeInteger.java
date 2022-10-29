package com.example.jex.other;

public class PalindromeInteger {
    /**
     * @param number an integer
     * @return its number of decimal digits
     */
    static public int decimalDigits(int number) {
        number = Math.abs(number);
        return number == 0 ? 0 : 1 + (int) Math.log10(number);
    }

    /**
     * @param number an integer
     * @return its leftmost decimal digit
     */
    static public int leftmostDecimalDigits(int number) {
        number = Math.abs(number);
        int size = decimalDigits(number);
        return (int) (number / Math.pow(10, size - 1));
    }

    /**
     * @param number an integer
     * @return its rightmost decimal digit
     */
    static public int rightmostDecimalDigits(int number) {
        number = Math.abs(number);
        return number % 10;
    }

    /**
     * @param number an integer
     * @return true if it is a decimal palindrome
     */
    static public boolean isDecimalPalindrome(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return true;
        }

        for (int exp = (int) Math.log10(number); exp > 0; exp -= 2) {
            int tenPower = (int) Math.pow(10, exp);
            int left = number / tenPower;
            if (left != number % 10) {
                return false;
            } else {
                number -= left * tenPower;
                number /= 10;
            }
        }
        return true;
    }
}
