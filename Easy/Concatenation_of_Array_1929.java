// Problem: 1929. Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Approach: Create a new array of size 2*n and copy elements twice
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Scanner;

public class Concatenation_of_Array_1929 {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array input
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Concatenation_of_Array_1929 obj = new Concatenation_of_Array_1929();
        int[] result = obj.getConcatenation(nums);

        // Print result
        System.out.println("Concatenated array:");
        for(int num : result){
            System.out.print(num + " ");
        }

        sc.close();
    }
}