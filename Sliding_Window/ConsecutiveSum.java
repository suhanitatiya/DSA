//maximum sum of any 3 consecutive elements
import java.util.*;

public class ConsecutiveSum {

    public static int Consecutive(int[] arr, int k) {
        int window_sum = 0;
        int max_sum = 0;

        for (int i = 0; i < k; i++) {
            window_sum += arr[i];
        }

        max_sum = window_sum;

        for (int i = k; i < arr.length; i++) {
            window_sum = window_sum + arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 1, 7, 3, 6 };
        int k = 3;
        int val = Consecutive(arr, k);

        System.out.println("The maximum sum is" + val);

    }
}