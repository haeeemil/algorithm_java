package string;

import java.util.Scanner;

public class Day006 {

    public String zippedString(String str) {
        String answer = "";

        str = str + " ";
        int count = 1;

        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if(chars[i-1] == chars[i]) {
                count++;
            } else {
                answer += str.charAt(i-1);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    public String crypto(int n, String str) {
        String answer = "";

        for(int i=0; i < n; i++) {
            String temp = str.substring(0, 7).replace('#', '1'). replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Day006 T = new Day006();
        Scanner keyboard = new Scanner(System.in);

        String str = keyboard.next(); // KKHSSSSSSSE
        System.out.println(T.zippedString(str));

        int num = keyboard.nextInt();
        String str2 = keyboard.next();
        System.out.println(T.crypto(num, str2));
    }
}
