class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        result = []
        seen = []
        last_index = [0]*26
        n = len(s)
        for i in range(n):
            last_index[ord(s[i])-ord('a')] = i
        
        for i in range(n):
            ch = s[i]
            if ch in seen:
                continue
            while(result and ch < result[-1] and last_index[ord(result[-1]) - ord('a')]>i):
                removed = result.pop()
                seen.remove(removed)
            result.append(ch)
            seen.append(ch)
        return "".join(result)
                
        