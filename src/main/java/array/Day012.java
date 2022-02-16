package array;

import java.util.Scanner;

public class Day012 {

    public int classMonitor(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i=1; i<n; i++) {
            int cnt = 0;
            for (int j=1; j < n; j++) {
                for (int k = 1; k < 6; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public int mentoring(int n, int m, int[][] arr) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for(int k=0; k<m; k++) {
                    int pi = 0, pj = 0;
                    for(int s=0; s < n; s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day012 T = new Day012();
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[][] arr = new int [n+1][6];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = keyboard.nextInt();
            }
        }
        System.out.println(T.classMonitor(n, arr));

        int m = keyboard.nextInt();
        int[][] arr2 = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j<n; j++) {
                arr[i][j] = keyboard.nextInt();
            }
        }
        System.out.println(T.mentoring(n, m, arr));
    }

}
