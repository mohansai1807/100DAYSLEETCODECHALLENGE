class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                arr[i] = nums[i];
                sum = sum + nums[i];
            }
            else{
                sum = sum + nums[i];
                arr[i] = sum;
            }
        }
        return arr;
    }
}