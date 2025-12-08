class Solution {
    public int lengthOfLastWord(String s) {

       /* StringBuilder sb=new StringBuilder(s.trim());
        sb.reverse();
        int i=0;
        while(i<sb.length() && sb.charAt(i)!=' '){
            i++;
        }
        return i;
        */
        
        //second way that takes less memory and excution time

        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int count = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}