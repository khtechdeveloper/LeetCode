public class Anagram {
    public static void main(String[] args) {
        String s="anagram", t="ramagan";
        System.out.println(isAnagram(s,t));
    }
    public static  boolean isAnagram(String s, String t) {
    
            return s.sort().equals(t.sort());
        

    }
}
