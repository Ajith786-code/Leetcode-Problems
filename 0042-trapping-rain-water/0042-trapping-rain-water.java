class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalwater=0;
        int start=0,end=n-1;
        int leftMax=0,rightMax=0;
        while(start<end)
        {
            leftMax=Math.max(leftMax, height[start]);
            rightMax=Math.max(rightMax, height[end]);

            if(leftMax<rightMax)
            {
                totalwater=totalwater+leftMax-height[start];
                start++;
            }
            else
            {
                totalwater=totalwater+rightMax-height[end];
                end--;
            }
        }
        return totalwater;
    }
}