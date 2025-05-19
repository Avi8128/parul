package com.parul19th;

public class UpLowBoundOfTwo {
    public static void main(String[] args) {
        int[] n = {1,2,2,2,3,4,5};
        int target = 2;
        int lowerBoundIndex = lowerBound(n, target);
        int upperBoundIndex = upperBound(n, target);
        System.out.println("Lower Bound of " + target + " is at index " + lowerBoundIndex);
        System.out.println("Upper Bound of " + target + " is at index " + upperBoundIndex);
    }
    public static int lowerBound(int[] n, int target) {
        int right = n.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (n[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static int upperBound(int[] n, int target) {
        int right = n.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (n[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}