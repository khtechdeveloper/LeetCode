class Solution {
    public int hammingWeight(int n) {
        if(n==0)    return 0;
        int count=0;
        while(n!=1){
            int r=n%2;
            n/=2;
            if(r==1){
                count++;
            }
        }
        return count+1;
    }
}