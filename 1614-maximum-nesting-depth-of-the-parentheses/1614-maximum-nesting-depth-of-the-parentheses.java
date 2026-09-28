class Solution {
    public int maxDepth(String s) {
        int c=0;
        int max=0;
        for(char ch:s.toCharArray()){

            if(ch=='('){
                c++;
            }
            else if(ch==')'){
                c--;
            }
            else{
                continue;
            }
            max=Math.max(max, c);
        }
        return max;
    }
}