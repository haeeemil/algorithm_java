package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Day008 {

    public ArrayList<Character> getWinners(int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            if(a[i] == b[i]) {
                answer.add('D');
            } else if(a[i] == 1 && b[i] == 3) {
                answer.add('A');
            } else if(a[i] == 2 && b[i] == 1) {
                answer.add('A');
            } else if(a[i] == 3 && b[i] == 2) {
                answer.add('A');
            } else {
                answer.add('B');
            }
        }
        return answer;
    }

    public int[] fibonacciNumber(int n) {

        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Day008 T = new Day008();
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        for(int x : T.fibonacciNumber(n)) {
            System.out.print(x+" ");
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = keyboard.nextInt();
        }

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = keyboard.nextInt();
        }

        System.out.println();
        for(char x : T.getWinners(arr1, arr2)){
            System.out.print(x+" ");
        }
    }
}
