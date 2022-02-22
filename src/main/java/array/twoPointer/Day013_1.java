package array.twoPointer;

import java.util.ArrayList;

public class Day013_1 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m) {
            if(a[p1] < b[p2]) {
                answer.add(a[p1]);
                p1++;
                // answer.add(a[p1++]);
            } else {
                answer.add(b[p2]);
                p2++;
                // answer.add(b[p2++]);
            }
        }
        // p1이 남아 있음
        while (p1 < n) {
            answer.add(a[p1++]);
        }

        // p2가 남아있음
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Day013_1 T = new Day013_1();

        for (int x: T.solution(3, 5, new int[]{1, 3, 5}, new int[]{2, 3, 6, 7, 9})) {
            System.out.print(x + " ");
        }

    }
}
