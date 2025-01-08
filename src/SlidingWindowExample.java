public class SlidingWindowExample {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window of size k
        System.out.println("Initial Window:");
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nInitial window sum: " + windowSum);
        maxSum = windowSum;

        // Slide the window from left to right over the array
        for (int i = k; i < arr.length; i++) {
            // Update the window sum by adding the new element and subtracting the old one
            windowSum += arr[i] - arr[i - k];
            
            // Print the current window
            System.out.print("Window [" + (i - k + 1) + " to " + i + "]: ");
            for (int j = i - k + 1; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("-> Window sum: " + windowSum);
            
            // Update maxSum if the current window's sum is greater
            if (windowSum > maxSum) {
                System.out.println("New max found: " + windowSum);
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum(arr, k));
    }
}
