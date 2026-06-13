class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int index = (r+l)/2;
            System.out.println(index);
            if (nums[index] == target) return index;
            else if (nums[index] > target) r--;
            else l++;
        }
        return -1;
    }
}
