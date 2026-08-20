class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int ind1=0;
        int ind2=0;
        arr1[ind1]=nums[0];
        ind1++;
        arr2[ind2]=nums[1];
        ind2++;
        for(int i=2;i<n;i++){

            if(arr1[ind1-1]>arr2[ind2-1]){
                arr1[ind1]=nums[i];
                ind1++;
            }
            else{
                arr2[ind2]=nums[i];
                ind2++;
            }
        }

        int res[]=new int[n];
        int k=0;
        for(int i=0;i<ind1;i++){
            res[k]=arr1[i];
            k++;
        }
        for(int i=0;i<ind2;i++){
            res[k]=arr2[i];
            k++;
        }
        return res;
    }
}