class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int right[] = new int[n];
        int pro = 1;
        for(int i=n-1;i>=0;i--){
            pro = pro * nums[i];
            right[i] = pro;
        }
        int answer[] = new int[n];
        int left = 1;
        for(int i=0;i<=n-1;i++){
            if(i==n-1){
                answer[n-1] = left;
                return answer;
            }
            else{
                int value = left * right[i+1];
                answer[i] = value;
                left = left * nums[i];
            }
        }
        return new int[0];
    }
}