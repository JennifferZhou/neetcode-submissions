class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map <String, List<String>> anagrams = new HashMap<>();
        int added = 0;
        for (int i = 0; i< strs.length; i++) {
            added = 0;
            for (String s : anagrams.keySet()){
                if (isAnagram(s, strs[i])) {
                    List<String> list = anagrams.get(s);
                    list.add(strs[i]);
                    added = 1;
                    break;
                }
            }
            if (added == 0) {
                List<String> newAnagram = new ArrayList<>();
                newAnagram.add(strs[i]);
                anagrams.put(strs[i], newAnagram);
            }
        }
        for (List<String> s: anagrams.values()) {
            res.add(s);
        }
        return res;
    }

    public Boolean isAnagram(String str1 ,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) return false; 
        for (int i = 0; i < arr1.length; i ++){
            if (arr1[i] != arr2[i]) return false;
        }
        System.out.println("These 2 are the same: " + str1 + " " + str2);
        return true;
    } 
}
