package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Day009 {

    public int getPrimeNumber(int n) {
        int answer = 0;

        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ch[i] == 0) {
                answer++;
                for(int j=i; j<=n; j = j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int num) {
        if(num ==1) {
            return false;
        } else {
            for(int i=2; i<num; i++) {
                if(num%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public ArrayList<Integer> reversePrimeNumber(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int tmp = arr[i];
            int res=0;
            while(tmp>0) {
                int t = tmp%10;
                res = (res*10)+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Day009 T = new Day009();
        Scanner keyboard = new Scanner(System.in);

        int num = keyboard.nextInt();
        System.out.println(T.getPrimeNumber(num));

        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = keyboard.nextInt();
        }
        for(int x : T.reversePrimeNumber(num, arr)) {
            System.out.print(x+" ");
        }
    }
}
