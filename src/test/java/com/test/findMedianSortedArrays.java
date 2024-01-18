package com.test;

import java.util.Arrays;

public class findMedianSortedArrays {
//    Input: nums1 = [1,2], nums2 = [3,4]
//    Output: 2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int k =0 ;
        for(int i = 0;i < nums1.length;i++){
            nums3[k++] = nums1[i];
        }
        for(int j = 0;j < nums2.length;j++){
            nums3[k++] = nums2[j];
        }

        Arrays.sort(nums3);

        if (nums3.length%2==0)
            return (float)(nums3[nums3.length/2-1] + nums3[nums3.length/2])/2;
        else
            return nums3[nums3.length/2];

    }
}
