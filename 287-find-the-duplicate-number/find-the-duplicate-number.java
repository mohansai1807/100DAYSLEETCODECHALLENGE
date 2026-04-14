class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            value = Math.abs(value);
            if(nums[value] > 0){
                nums[value] = -nums[value];
            } 
            else{
                ans = value;
                break;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }

        return ans;
    }
}