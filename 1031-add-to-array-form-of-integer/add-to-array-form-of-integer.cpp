class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        vector<int> v;
        int n = num.size()-1;
        int carry = 0;

        while(n>=0 || k>0){
            int num_value = 0;
            if(n>=0){
                num_value = num[n];
            }

            int d = k%10;
            int sum = num_value + d + carry;

            int digit = sum%10;
            carry = sum/10;

            v.push_back(digit); 

            n--;
            k=k/10;
        }
        if(carry>0){
            v.push_back(carry);
        }
        reverse(v.begin(),v.end());
        return v;
    }
};







