class Solution {
    public int countCommas(int n) {
        // If n < 1000, it returns 0. Otherwise, it counts 1 comma per number.
        return Math.max(0, n-999);
    }
}