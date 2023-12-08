class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        int y = 1;
        int count = 0;
        while(y < nums.length){
            if(nums[y] > nums[x]){
                count++;
                x++;
                y++;
            }
            if(y < nums.length && nums[x] == nums[y]){
                y++;
            }
        }
        return count;
    }
}