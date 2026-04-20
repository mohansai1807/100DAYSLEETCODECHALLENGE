class Solution:
    def reverseWords(self, s: str) -> str:
        # return " ".join(s.split()[::-1])
        words = s.split()
        words.reverse()
        return " ".join(words)