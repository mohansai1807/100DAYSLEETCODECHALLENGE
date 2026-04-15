class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int stone1 = pq.remove();
            int stone2 = pq.remove();
            int newstone = stone1-stone2;
            if(newstone!=0){
                pq.add(newstone);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
}