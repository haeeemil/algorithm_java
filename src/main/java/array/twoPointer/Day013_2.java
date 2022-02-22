package array.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class Day013_2 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); // a배열 오름차순 정렬
        Arrays.sort(b); // b배열 오름차순 정렬
        int p1 = 0, p2 = 0;
        while(p1 <n && p2 <m) {
            if(a[p1] < b[p2]) {
                p1++;
            } else if(a[p1] > b[p2]) {
                p2++;
            } else {
                answer.add(a[p1++]);
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day013_2 T = new Day013_2();

        for (int x: T.solution(5, 5, new int[]{1, 3, 9, 5, 2}, new int[]{3, 2, 5, 7, 8})) {
            System.out.print(x + " ");
        }

    }
}
