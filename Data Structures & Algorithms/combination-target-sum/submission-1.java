class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Set<String> set = new HashSet<>();
        bt(nums,0,path,out,target);

        return out;
    }

    private void bt(int[] nums, int i, List<Integer> path, List<List<Integer>> out, int remain){
       
        if(remain == 0){
        out.add(new ArrayList<>(path));
        return;
        } else if(remain < 0){
            return;
        }
      
        for(int v = i; v < nums.length; v++){
            path.add(nums[v]);
            //take this instance of the value
            bt(nums,v,path,out,remain-nums[v]);
            path.removeLast();

        }
    }

    private String getSetKey(List<Integer> path){
        int[] key = new int[31];
        for(int i : path){
            key[i]++;
        }
        return Arrays.toString(key);
    }

}
