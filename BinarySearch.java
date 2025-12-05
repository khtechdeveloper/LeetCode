class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        int start=0,end=nums.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid;
                start++;
            }else if(nums[mid]>target){
                end=mid;
                end--;
            }
        }
        return -1;
    }
}