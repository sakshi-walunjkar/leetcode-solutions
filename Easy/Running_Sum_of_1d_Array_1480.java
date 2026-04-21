// Problem: 1480. Running Sum of 1D Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Approach: Each element stores sum of itself and previous elements
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Scanner;

public class Running_Sum_of_1d_Array_1480 {

    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Running_Sum_of_1d_Array_1480 obj = new Running_Sum_of_1d_Array_1480();
        int[] result = obj.runningSum(nums);

        // Output using normal for loop
        System.out.println("Running Sum:");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}