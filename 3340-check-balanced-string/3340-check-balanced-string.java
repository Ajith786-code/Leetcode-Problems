class Solution {
    public boolean isBalanced(String num) {
        
        int eSum=0,oSum=0;
        for(int i=0;i<num.length();i++){

            int digit=num.charAt(i)-'0';
            if(i%2==0){
                eSum=eSum+digit;
            }
            else{
                oSum=oSum+digit;
            }
        }
        return eSum==oSum;
    }
}