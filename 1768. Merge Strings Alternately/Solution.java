class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int max = Math.max(l1,l2);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < max; i++){
            if(i < l1)
                sb.append(word1.charAt(i));
            if(i < l2)
                sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}