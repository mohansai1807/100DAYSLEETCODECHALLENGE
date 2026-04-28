class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = s.replace(" ","").lower()
        t = t.replace(" ","").lower()
        if(len(s)!=len(t)):
            return False

        dict_a = {}
        for i in s:
            dict_a[i] = dict_a.get(i,0)+1
        
        for j in t:
            if j not in dict_a or dict_a[j]==0:
                return False
            dict_a[j] = dict_a[j] - 1 
        
        return True
            
        
        