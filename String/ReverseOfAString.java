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
        
        String ans = "";
        int j = a.size() - 1;
        
        for(int i=0; i<s.length(); i++)
        {    
            char k = s.charAt(i); 
            char lk = Character.toLowerCase(k); 
            if(lk=='a' || lk=='e' || lk=='i' || lk=='o' || lk=='u')
            {
               ans = ans + a.get(j);
               j--;
            }
            else 
            {
                ans = ans + k;
            }
        }
        
        return ans;
    }
}
