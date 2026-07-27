class Solution {
    public int minIndexChar(String s1, String s2) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s2.length(); i++){
            set.add(s2.charAt(i));
        }
        
        for(int i=0; i<s1.length(); i++){
            if(set.contains(s1.charAt(i))){
                return i;
                }
        }
        return -1;
    }
}