package array;

import java.util.Scanner;

public class Day011 {

    public int countCenterMax(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        // nx = i + dx[k];
        // ny = j + dy[k];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n) {   // ArrayIndexOutOfBoundsException
                        if(arr[nx][ny] >= arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }

                if(flag == true) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int maxSum(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0;  j < n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Day011 T = new Day011();
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n ; j++) {
                arr[i][j] = keyboard.nextInt();
            }
        }
        // System.out.println(T.maxSum(n, arr));
        System.out.println(T.countCenterMax(n, arr));
    }
}
