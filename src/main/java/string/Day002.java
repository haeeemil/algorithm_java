package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Day002 {

    public String searchWord(String str) {
        String answer = "";

        String[] tempArray = str.split(" ");
        answer = tempArray[0];
        for(int i = 1; i < tempArray.length; i++) {
            if(answer.length() < tempArray[i].length()) {
                answer = tempArray[i];
            }
        }

        return answer;
    }

    public String searchWord2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public String searchWord3(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                answer = tmp;
                str = str.substring(pos+1);
            }
            // last word
            if (str.length() > m) {
                answer = str;
            }
        }

        return answer;
    }

    public ArrayList<String> reverseWords(int n, String[] str) {
        ArrayList<String> answers = new ArrayList<>();

        for(String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answers.add(temp);
        }

        return answers;
    }

    public ArrayList<String> reverseWords2(int n, String[] str) {
        ArrayList<String> answers = new ArrayList<>();

        for (String x : str) {
            char[]  c = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(c);
            answers.add(temp);
        }

        return answers;
    }

    public static void main(String[] args) {
        Day002 T = new Day002();
        Scanner keyboard = new Scanner(System.in);

        String str = keyboard.nextLine();

        System.out.println("Search Word");
        System.out.println(T.searchWord(str));
        System.out.println(T.searchWord2(str));
        System.out.println(T.searchWord3(str));
        System.out.println();

        int n = keyboard.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = keyboard.next();
        }

        System.out.println("Reverse Word");
        for (String x : T.reverseWords(n, strArray)) {
            System.out.println(x);
        }
        for (String x : T.reverseWords2(n, strArray)) {
            System.out.println(x);
        }
    }
}
