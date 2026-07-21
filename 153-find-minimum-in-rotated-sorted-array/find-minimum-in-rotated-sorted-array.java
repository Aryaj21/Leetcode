class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            else{
                ans=Math.min(nums[mid],ans);
                hi=mid-1;
            }
        }
        return ans;
    }
}