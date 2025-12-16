class Solution {
    public int climbStairs(int n) {
        int first=1,second=1, res=0;
        for(int i=1;i<=n;i++){
            res=res+first;
            first=second;
            second=res;
        }
        return res;
    }
}