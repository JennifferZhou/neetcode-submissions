class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String newS = new String(arr);
            res.putIfAbsent(newS, new ArrayList<String>());
            List<String> match = res.get(newS);
            match.add(strs[i]);
        }
        List<List<String>> rets = new ArrayList<> ();
        for (List<String> list : res.values()) {
            rets.add(list);
        }
        return rets;
    }

}
