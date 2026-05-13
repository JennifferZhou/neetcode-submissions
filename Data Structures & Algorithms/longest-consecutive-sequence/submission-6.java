class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 ) return 0;
        Arrays.sort(nums);
        int start = nums[0];
        int count = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (start == nums[i]) continue;
            if ((start+1) == nums[i]){
                System.out.println(nums[i] + " , " + count);
                count++;
            }
            else {
                count = 1;
            }
            if (count >= max) max = count;
            start = nums[i];  
        }
        return Math.max(max, count);

    }
}
