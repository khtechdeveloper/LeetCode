class Solution {
    public static int asciiValue(String s){
        int ascii=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ascii+=(int)ch;
        }
        return ascii;
    }
    public boolean isAnagram(String s, String t) {
        // char a[]=s.toCharArray();
        // char b[]=t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);

        // if(Arrays.equals(a,b)){
        //     return true;
        // }else{
        //     return false;
        // }
        // OR

        if(asciiValue(s)==(asciiValue(t))){
            return true;
        }else{
            return false;
        }

    }
}