class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> count=new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num, 0)+1);
        }

        for(int val:count.values()){
            if(val>2){
                return false;
            }
        }
        return true;
    }
}