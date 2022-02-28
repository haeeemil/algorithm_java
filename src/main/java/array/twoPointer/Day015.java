package array.twoPointer;

public class Day015 {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for(int rt = 0; rt<n; rt++) {
            sum += arr[rt];
            if(sum == m) {
                answer++;
            }
            while(sum >= m) {
                sum-=arr[lt++];
                if(sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day015 T = new Day015();
        System.out.println(T.solution(8, 6, new int[] {1, 2, 1, 3, 1, 1, 1, 2}));
    }
}
