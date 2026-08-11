class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int s1=s.length();
        int p1=p.length();
        List<Integer> result=new ArrayList<>();
        if(s1<p1) return result;
        int a[]=new int[26];
        int b[]=new int [26];
        for(int i=0;i<p1;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a, b)){
            result.add(0);
        }
        for(int i=p1;i<s1;i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(i-p1)-'a']--;

            if(Arrays.equals(a, b)){
                result.add(i-p1+1);
            }
        }
        return result;
    }
}