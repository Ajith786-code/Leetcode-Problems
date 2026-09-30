class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            if(freq[i]>2){
                return false;
            }
        }
        return true;
    }
}