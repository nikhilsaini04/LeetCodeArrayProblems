// 1752. Check if Array Is Sorted and Rotated
// link --> https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++)
            if(nums[i-1]>nums[i])
                cnt++;
        if(nums[nums.length-1]>nums[0])
            cnt++;
        
        if(cnt>1)
            return false;
        return true;
    }
}
