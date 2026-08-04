class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        boolean contains[]=new boolean[101];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            max=Math.max(max,ele);
            min=Math.min(min, ele);
            contains[ele]=true;
        }

        for(int i=min;i<=max;i++){
            if(!contains[i]){
                res.add(i);
            }
        }
        return res;
    }
}