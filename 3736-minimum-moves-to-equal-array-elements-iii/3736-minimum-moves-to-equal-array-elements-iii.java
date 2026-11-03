class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, nums[i]);
        }
        int moves=0;
        for(int i=0;i<n;i++){
            moves=moves+Math.abs(max-nums[i]);
        }
        return moves;
    }
}