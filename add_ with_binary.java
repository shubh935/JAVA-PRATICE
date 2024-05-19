

    import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 25, 30};
        int targetSum = 40;
        findTwoSum(arr, targetSum);
    }

    public static void add_with_binary(int[] arr, int targetSum) {
        Arrays.sort(arr); // Sort the array

        // Use binary search to find the pair of elements whose sum is equal to targetSum
        for (int i = 0; i < arr.length - 1; i++) {
            int complement = targetSum - arr[i];
            int low = i + 1;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == complement) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[mid]);
                    return;
                } else if (arr[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("No pair found with sum equal to " + targetSum);
    }
}
    

