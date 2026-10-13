class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long squares[]=new long[n];
        for(int i=0;i<n;i++){
            int num=nums[i];
            squares[i]=num*num;
        }
        Arrays.sort(squares);
        int minus=n/2;
        long max=0;
        for(int i=0;i<n;i++){
            if(i<minus){
                max=max-squares[i];
            }
            else{
                max=max+squares[i];
            }
        }
        return max;
    }
}