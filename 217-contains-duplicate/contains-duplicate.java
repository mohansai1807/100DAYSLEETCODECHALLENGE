class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for(int num : nums){
            sets.add(num);
        }
        if(nums.length == sets.size()){
            return false;
        }
        else{
            return true;
        }
    }
}