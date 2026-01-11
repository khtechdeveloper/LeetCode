public class RotateArray {
    
}
class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length,index=0;
        k=k%len;
        int res[]=new int[len];
        for(int i=len-k;i<len;i++){
            res[index++]=nums[i];
        }
        for(int j=0;j<len-k;j++){
            res[index++]=nums[j];
        }
        for(int i=0;i<len;i++){
            nums[i]=res[i];
        }
    }
}