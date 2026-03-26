class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        value = s.split(" ")
        list_a = []
        for i in value:
            if i!="":
                list_a.append(i) 
        res = list_a[-1]
        return len(res)