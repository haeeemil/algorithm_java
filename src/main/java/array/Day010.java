package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Day010 {

    public int sumOfPoint(int[] arr) {
        int answer = 0;

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                point++;
                answer += point;
            } else {
                point = 0;
            }
        }
        return answer;
    }

    public ArrayList<Integer> sortOfGrade(int[] arr) {
         ArrayList<Integer> answer = new ArrayList<>();

         for (int i = 0; i < arr.length; i++) {
             int grade = 1;
             for (int j = 0; j < arr.length; j++) {
                 if (arr[j] > arr[i]) {
                     grade++;
                 }
             }
             answer.add(grade);
         }

         return answer;
    }

    public static void main(String[] args) {
        Day010 T = new Day010();
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
        }
        // System.out.println(T.sumOfPoint(arr));

        for (int x : T.sortOfGrade(arr)) {
            System.out.print(x+" ");
        }
    }
}
