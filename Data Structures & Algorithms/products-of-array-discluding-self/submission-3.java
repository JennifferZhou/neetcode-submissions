class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int num_zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                total *= nums[i];
            else num_zeros++;
        }
        int[] res = new int[nums.length];
        if (num_zeros == 1) {
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == 0) res[k] = total;
                else res[k] = 0;
            }
            return res;
        }
        if (num_zeros >= 2) {
            return res; 
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = total/ nums[i];
        }
        return res;
    }
}  
