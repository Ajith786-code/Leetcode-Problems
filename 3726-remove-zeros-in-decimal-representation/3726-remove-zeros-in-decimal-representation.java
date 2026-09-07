class Solution {
    public long removeZeros(long n) {
        String s="";
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                s=s+str.charAt(i);
            }
        }
        return Long.parseLong(s);
    }
}