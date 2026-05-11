class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int f = 0;
        int maxCont = 0;
        for (int i : nums) {
            if (i == 1) {
                f = f + 1;
                if (f > maxCont) {
                    maxCont = f;
                }
            }
            if (i == 0) {
                f = 0;
            }
        }
        return maxCont;
    }
}