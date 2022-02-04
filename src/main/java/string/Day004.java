package string;

import java.util.Scanner;

public class Day004 {

    public boolean isPalindrome (String str) {
        boolean answer = true;

        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len /2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }

        return answer;
    }

    public boolean isPalindrome1 (String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindrome2 (String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Day004 T = new Day004();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();

        System.out.println("Palindrome");
        System.out.println(T.isPalindrome(str));
        System.out.println(T.isPalindrome1(str));
        System.out.println();

        String str2 = keyboard.nextLine(); // found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(T.isPalindrome2(str2));
    }
}
