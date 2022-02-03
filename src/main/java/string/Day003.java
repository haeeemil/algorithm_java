package string;

import java.util.Scanner;

public class Day003 {

    public String reverseAlphabet(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public String deleteDuplicate(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day003 T = new Day003();
        Scanner keyboard = new Scanner(System.in);

        String str = keyboard.next();   // a#b!GE*T@S
        System.out.println("Reverse Alphabet");
        System.out.println(T.reverseAlphabet(str));
        System.out.println();

        String str2 = keyboard.next();  // ksekkset
        System.out.println("Delete Duplicate");
        System.out.println(T.deleteDuplicate(str2));
    }
}
