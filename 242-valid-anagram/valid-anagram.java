class Solution {
    public boolean isAnagram(String s, String t) {
        int[] character=new int[26];
        for(int i=0;i<s.length();i++)
        {
            character[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            character[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(character[i] != 0)
            return false;
        }
        return true;
    }
}