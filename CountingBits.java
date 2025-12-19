class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];  
        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp=i;
            while(temp>=1){
                int r=temp%2;
                if(r==1){
                    count++;
                }
                temp/=2;
            }
            arr[i]=count;
        }
        return arr;
    }
}