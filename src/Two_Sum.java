import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int soHienTai = nums[i];
            int soCanTim = target - soHienTai;
            if (map.containsKey(soCanTim)) {
                return new int[]{map.get(soCanTim), i};
            } else {
                map.put(soHienTai, i);
            }
        }
        return new int[]{-1, -1};
    }
}