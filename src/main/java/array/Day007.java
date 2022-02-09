package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Day007 {

    public ArrayList<Integer> printBiggers(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i == 0 ) {
                answer.add(arr[i]);
            } else {
                if(arr[i-1] < arr[i]) {
                    answer.add(arr[i]);
                }
            }
        }

        return answer;
    }

    public ArrayList<Integer> printBiggers2(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 첫번째는 무조건 들어간다
        answer.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public Integer printTallers(int[] arr) {
        int answer = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day007 T = new Day007();
        Scanner keyboard = new Scanner(System.in);

        int count = keyboard.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = keyboard.nextInt();
        }

        for (int x : T.printBiggers(arr)) {
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println(T.printTallers(arr));
    }
}
