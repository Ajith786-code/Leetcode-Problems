class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack("", n, ans);
        return ans;
    }
    public void backtrack(String current,int n, List<String> ans){

        if(current.length() ==2*n){
           if(isValid(current)){
                ans.add(current);
           }
           return;
        }
        backtrack(current+"(", n, ans);

        backtrack(current+")", n, ans);
    }
    boolean isValid(String s){
        int balanced=0;

        for(int ch:s.toCharArray()){

            if(ch=='('){
                balanced++;
            }
            else{
                balanced--;
            }

            if(balanced<0){
                return false;
            }
        }
        return balanced==0;
    }
}