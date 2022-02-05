package string;

import java.util.Scanner;

public class Day005 {

    public Integer getNumberOnly1(String str) {
        int answer = 0;

        String temp = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(temp);

        return answer;
    }

    /**
     * ASCII
     * NUMBER: 48 ~ 57
     */
    public Integer getNumberOnly2(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x -48);
            }
        }

        return answer;
    }

    public Integer getNumberOnly3(String str) {
        String temp = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                temp += x;
            }
        }

        return Integer.parseInt(temp);
    }

    public int[] distanceOfCharacter(String str, char c) {
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Day005 T = new Day005();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();   // g0en2T0s8eSoft

        System.out.println("Get Number Only");
        System.out.println(T.getNumberOnly1(str));
        System.out.println(T.getNumberOnly2(str));
        System.out.println(T.getNumberOnly3(str));
        System.out.println();

        String word = keyboard.next();  // teachermode
        char target = keyboard.next().charAt(0);

        System.out.println("Distance of Character");
        for (int x : T.distanceOfCharacter(word, target)) {
            System.out.print(x + " ");
        }
    }
}
