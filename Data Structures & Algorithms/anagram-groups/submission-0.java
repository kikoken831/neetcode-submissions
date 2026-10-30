class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        Map<String,List<String>> groups = new HashMap<>();
        for(String s : strs){
            groups.computeIfAbsent(getKey(s), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

    private String getKey(String word){
        int[] map = new int[26];
        for(char c : word.toCharArray()){
            map[c - 'a']++;
        }

        return Arrays.toString(map);

    }
}
