class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] count = new int[26];

        // Fill frequency for p
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0, right = 0, n = s.length(), k = p.length();

        while (right < n) {
            // include current char
            count[s.charAt(right) - 'a']--;

            // If window size exceeds k, remove left char
            if (right - left + 1 > k) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            // If all counts are zero → valid anagram
            if (right - left + 1 == k && allZero(count)) {
                result.add(left);
            }

            right++;
        }

        return result;
    }

    // Helper function
    private boolean allZero(int[] count) {
        for (int x : count) {
            if (x != 0) return false;
        }
        return true;
    }
}