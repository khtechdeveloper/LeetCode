class Solution {
    public char findTheDifference(String s, String t) {
        int sAscii=0;
        int tAscii=0;
        for(int i=0;i<s.length();i++){
            sAscii+=(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            tAscii+=(int)t.charAt(i);
        }
        int diff=tAscii-sAscii;
        char ch=(char)diff;
    return ch;
    }
}