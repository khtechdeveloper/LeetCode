class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // int sum=0,len=nums.length,s=0;
        // boolean flag=false;
        // for(int num: nums){
        //     sum+=num;
        // }
        // for(int i=0;i<len;i++){
        //     if(nums[i]<k){
        //         s+=nums[i];
        //         if(s==k){
        //            flag=true; 
        //         }
        //     }
        // }
        // if(sum%len==k || flag==true){
        //     return true;
        // }else{
        //     return false;
        // }
    
        int sum = 0;
        int previousRemainder = 0;
        Set<Integer> seenRemainders = new HashSet<>();
        
        for (int num : nums) {
            sum += num;
            int currentRemainder = sum % k; 
            if (seenRemainders.contains(currentRemainder)) {
                return true;
            }
            seenRemainders.add(previousRemainder);
            previousRemainder = currentRemainder;
        }
        return false;
    }
}