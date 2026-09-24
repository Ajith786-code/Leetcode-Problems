class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            char c=sentence.charAt(i);
            freq[c-'a']++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
}