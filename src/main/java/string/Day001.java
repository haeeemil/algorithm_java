package string;

import java.util.Scanner;

public class Day001 {

    public int searchCharacter1(String str, char chr) {
        int answer = 0;

        str = str.toUpperCase();
        chr = Character.toUpperCase(chr);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr) {
                answer++;
            }
        }

        return answer;
    }

    public int searchCharacter2(String str, char chr) {
        int answer = 0;

        str = str.toUpperCase();
        chr = Character.toUpperCase(chr);

        for(char x : str.toCharArray()) {
            if(x == chr) {
                answer++;
            }
        }

        return answer;
    }

    public String changeCase1(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    /**
     * ASCII
     * UPPER CASE: 65~90
     * LOWER CASE: 97~122
     * The difference between two numbers is always 32
     */
    public String changeCase2(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) {
                answer += (char)(x + 32);
            } else {
                answer += (char)(x-32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day001 T = new Day001();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        char chr = keyboard.next().charAt(0);

        System.out.println("Search Character");
        System.out.println(T.searchCharacter1(str, chr));
        System.out.println(T.searchCharacter2(str, chr));
        System.out.println();
        System.out.println("Change Case");
        System.out.println(T.changeCase1(str));
        System.out.println(T.changeCase2(str));
    }
}