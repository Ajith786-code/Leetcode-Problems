class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        
        for(int i=0;i<=n;i++){

            int kMult=(i+1)*k;
            if(!list.contains(kMult)){
                return kMult;
            }
        }
        return -1;
    }
}