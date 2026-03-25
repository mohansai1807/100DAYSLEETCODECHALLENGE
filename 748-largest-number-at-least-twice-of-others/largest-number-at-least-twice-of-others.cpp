class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int max = nums[0];
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        bool check = true;
        int final;
        for(int i=0;i<n;i++){
            if(nums[i] == max){
                final = i;
                continue;
            }
            if(max < nums[i]*2){
                check = false;
                break;
            }
        }
        if(check){
            return final;
        }
        return -1;
        
    }
};