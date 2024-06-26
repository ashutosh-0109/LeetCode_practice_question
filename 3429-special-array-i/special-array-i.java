class Solution {
    public boolean isArraySpecial(int[] nums) {
        int length = nums.length;
       // boolean flag = true;
        int i=1;
        if (length == 1)
        return true;

        for(;i<length;i++)
        {
            if((nums[i]+nums[i-1])%2 == 0)
            return false;
        }
        return true;
    }
}