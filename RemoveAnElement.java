class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0,len=nums.length-1;
        for(int i=0;i<=len;i++){
            if(nums[i]==val){
                nums[i]=nums[len];
                --i;
                --len;
            }else{
                k++;
            }
            
        }
        return k;
    }
}