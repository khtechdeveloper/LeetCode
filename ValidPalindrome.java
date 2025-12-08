class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        StringBuilder temp = new StringBuilder(); 
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                temp.append(ch);
            }
        }
        int start=0, end=temp.length()-1;
        while(start<end){
            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}