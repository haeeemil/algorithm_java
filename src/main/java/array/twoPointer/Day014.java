package array.twoPointer;

public class Day014 {

    public int solution (int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for(int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
    public static void main(String[] args) {
        Day014 T = new Day014();

        System.out.println(T.solution(10, 3, new int[]{ 12, 15, 11, 20, 25, 10, 20, 19, 13, 15}));
    }
}
