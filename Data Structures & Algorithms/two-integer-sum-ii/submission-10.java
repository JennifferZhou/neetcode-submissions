class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int diff;

        for (int i = 0; i < numbers.length; i++) {
            diff = target - numbers[i];
            int index1 = 0;
            int index2 = numbers.length-1;
            // use binary search to look for diff
            while(index1 <= index2 && index1 < numbers.length && index2 > 0) {
                int mid = index1 + (index2-index1)/2;
                System.out.println("mid: " + mid + " index1: " + index1 + " index2: " + index2);
                 if (mid == i) {
                    index1 = mid + 1;
                    continue;
                }
                if (numbers[mid] == diff) return new int[] {i+1, mid+1};
                if (numbers[mid] > diff) {
                    index2 = mid -1;
                }
                else {
                    index1 = mid +1;
                }
            }
            
        }return new int[0];
    }
}
