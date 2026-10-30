class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        } 

        for(int n : nums){
            counter.merge(n,1,Integer::sum);
        }

        counter.forEach((num, count) -> {
            freq[count].add(num);
        });

        int[] res = new int[k];
        int idx = 0;
        for(int i = freq.length-1; i >= 0 && idx < k; i--){

            for(int n : freq[i]){
                res[idx++] = n;
                if(idx == k) return res;
            }
        }

        
        

        return res;
    }
}
