class Solution {
    public int countElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            min=Math.min(min, nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && min<nums[i]){
                count++;
            }
        }
        return count;
    }
}