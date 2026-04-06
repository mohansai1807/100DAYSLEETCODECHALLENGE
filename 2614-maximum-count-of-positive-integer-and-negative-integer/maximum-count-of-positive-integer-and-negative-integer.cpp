class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int pos_count = 0;
        int neg_count = 0;
        for(int k:nums){
            if(k>0){
                pos_count++;
            }
        }
        for(int k:nums){
            if(k<0){
                neg_count++;
            }
        }
        return max(pos_count,neg_count);
    }
};