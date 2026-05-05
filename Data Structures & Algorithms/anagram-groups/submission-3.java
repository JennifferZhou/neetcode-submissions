class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newS = new String(arr);

            if (res.containsKey(newS)) {
                List<String> match = res.get(newS);
                match.add(s);
            }
            else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                res.put(newS, newList);
            }
        }
        List<List<String>> rets = new ArrayList<> ();
        for (List<String> list : res.values()) {
            rets.add(list);
        }
        return rets;
    }

}
