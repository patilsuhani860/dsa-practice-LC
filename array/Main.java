import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> a = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++)
        {    
            char k = s.charAt(i); 
            char lk = Character.toLowerCase(k); 
            if(lk=='a' || lk=='e' || lk=='i' || lk=='o' || lk=='u')
            {
                a.add(k);
            }
        }
        
        int j = a.size() - 1;
        
        for(int i=0; i<s.length(); i++)
        {    
            char k = s.charAt(i); 
            char lk = Character.toLowerCase(k); 
            if(lk=='a' || lk=='e' || lk=='i' || lk=='o' || lk=='u')
            {
               // Cut the string before the vowel, drop in the new vowel, and paste the rest
               s = s.substring(0, i) + a.get(j) + s.substring(i + 1);
               j--;
            }
        }
        
        return s;
    }
}
