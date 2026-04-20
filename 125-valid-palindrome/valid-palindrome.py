class Solution:
    def isPalindrome(self, s: str) -> bool:
        input_a = ""
        for i in s:
            i = i.lower()
            if(i.isalpha() or i.isdigit()):
                input_a = input_a + i
        
        if(input_a == input_a[::-1]):
            return True 
        else:
            return False