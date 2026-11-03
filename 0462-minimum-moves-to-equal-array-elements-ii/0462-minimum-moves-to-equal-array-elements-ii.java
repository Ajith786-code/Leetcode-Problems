class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=nums[n/2];
        long moves=0;
        for(int i=0;i<n;i++){
            moves=moves+Math.abs((long) nums[i]-mid);
        }
        return (int)moves;
    }
}