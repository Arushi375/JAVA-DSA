// Last updated: 10/30/2026, 10:32:11 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> ans = new HashMap<>();
4        for(String word:strs){
5            char arr[]=word.toCharArray();
6            Arrays.sort(arr);
7            String key = new String(arr);
8            if(!ans.containsKey(key)){
9                ans.put(key,new ArrayList<>());
10            }
11            ans.get(key).add(word);
12
13        }
14        return new ArrayList<>(ans.values());
15    }
16}