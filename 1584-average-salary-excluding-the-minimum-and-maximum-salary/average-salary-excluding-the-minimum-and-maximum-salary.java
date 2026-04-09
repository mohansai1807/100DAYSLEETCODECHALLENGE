class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int count = 0;
        int min_el = salary[0];
        int max_el = salary[0];
        for(int k : salary){
            if(k<min_el){
                min_el = k;
            }
            if(k>max_el){
                max_el = k;
            }
        }
        for(int k:salary){
            if(k==max_el || k==min_el){
                continue;
            }
            else{
                sum = sum + k;
                count = count + 1;
            }
        }
        return sum/count;
    }
}