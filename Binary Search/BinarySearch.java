/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
*/
import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=end-(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}

class BinarySearch {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n=sn.nextInt();
    int[] nums = new int[n];
    for(int i=0;i<n;i++)
    {
      nums[i]=sn.nextInt();
    }
    int target=sn.nextInt();
    System.out.println(new Solution().search(nums,target));
  }
}
