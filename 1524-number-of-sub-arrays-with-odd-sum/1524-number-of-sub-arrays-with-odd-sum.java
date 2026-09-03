class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int n=arr.length;
        int evenCount=1,oddCount=0,prefixSum=0,result=0;
        for(int num:arr){
            prefixSum=prefixSum+num;
            if(prefixSum%2==0){
                result=(result+oddCount)%MOD;
                evenCount++;
            }
            else{
                result=(result+evenCount)%MOD;
                oddCount++;
            }
        }
        return result;
    }
}