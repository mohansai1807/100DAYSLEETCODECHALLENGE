class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if(x<0) return false;
        while(x!=0){
            int last_digit = x%10;
            if(rev > INT_MAX/10 || rev <INT_MIN/10){
                return 0;
            }
            rev = rev * 10 + last_digit;
            x=x/10;
        }
        if(temp == rev){
            return true;
        }
        else{
            return false;
        }
    }
};