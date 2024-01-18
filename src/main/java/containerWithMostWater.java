package com.test;


public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (right < left) {
            int w = left - right;
            int h = Math.min(height[right], height[left]);
            int area = w * h;
            max = Math.max(max, area);
            if (height[right] < height[left]) right++;
            else if (height[right] > height[left]) left--;
            else {
                right++;
                left--;
            }
        }
        return max;
    }

}
