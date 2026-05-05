class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newS = new String(arr);
            res.putIfAbsent(newS, new ArrayList<String>());
            List<String> match = res.get(newS);
            match.add(s);
        }
        List<List<String>> rets = new ArrayList<> ();
        for (List<String> list : res.values()) {
            rets.add(list);
        }
        return rets;
    }

}
