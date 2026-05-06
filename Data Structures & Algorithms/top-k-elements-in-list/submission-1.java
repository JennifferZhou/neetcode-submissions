class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfPresent(nums[i], (m, v) -> v+1);
            map.putIfAbsent(nums[i], 1);
            System.out.println( nums[i] + " count: " + map.get(nums[i]));
        }
        List<int[]> count = new ArrayList<>();
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> e : entries) {
            
            count.add(new int[] {e.getValue(), e.getKey()});
        }
        count.sort((a,b) -> b[0]-a[0]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = (count.get(i)[1]);
        }
        return res;
    }
}
