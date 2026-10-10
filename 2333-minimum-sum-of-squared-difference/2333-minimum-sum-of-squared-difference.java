import java.util.Collections;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int maxDiff = 0;
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diffs[i]);
        }
        
        int[] count = new int[maxDiff + 1];
        long totalDiff = 0;
        for (int diff : diffs) {
            count[diff]++;
            totalDiff += diff;
        }
        
        if (k >= totalDiff) {
            return 0;
        }
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            if (count[i] > 0) {
                
                long take = Math.min(k, (long) count[i]);
                count[i] -= take;
                count[i - 1] += take;
                k -= take;
            }
        }
        long ans = 0;
        for (int i = 1; i <= maxDiff; i++) {
            if (count[i] > 0) {
                ans += (long) count[i] * i * i;
            }
        }
        return ans;
    }
}
