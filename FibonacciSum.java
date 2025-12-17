class Solution {
    public int fib(int n) {
        int f0=0,f1=1,sum=0;
        if(n==1){
            return f1;
        }
        for(int i=1;i<n;i++){
            sum=f0+f1;
            f0=f1;
            f1=sum;
        }
        return sum;
    }
}