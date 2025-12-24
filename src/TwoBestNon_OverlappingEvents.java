import java.util.Arrays;
import java.util.Scanner;

public class TwoBestNon_OverlappingEvents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] events = new int[n][3];
        for (int i = 0; i < n; i++) {
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();
            events[i][2] = sc.nextInt();
        }
        System.out.println(maxTwoEvents(events));
    }

    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int n = events.length;
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = events[n - 1][2];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], events[i][2]);
        }
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = events[i][2];
            int nextEventIndex = binarySearch(events, events[i][1]);
            if (nextEventIndex != -1) {
                currentValue += suffixMax[nextEventIndex];
            }
            maxSum = Math.max(maxSum, currentValue);
        }
        return maxSum;
    }

    private static int binarySearch(int[][] events, int targetEndTime) {
        int left = 0;
        int right = events.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (events[mid][0] > targetEndTime) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
