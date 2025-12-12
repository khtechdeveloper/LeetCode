public class Permutations {
    public static void main(String[] args) {
        int arr[]={1,2};
        Permutations(arr);
    }
    static void Permutations(int arr[]){
        System.out.println("heloo");
        int len=fact(arr.length);
        for(int i=0;i<len;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]);
            }
        }


    }
    static int fact(int n){
        int fact=1;
        if(n==1){
            return fact;
        }
        return n*fact(n-1);
    }
}
