class Solution {
    public boolean isPowerOfFour(int n) {
        
        for(int i=0;i<=15;i++){
            double res=Math.pow(4,i);
            if(res==n){
                return true;
            }
        }
        return false;
    }
}