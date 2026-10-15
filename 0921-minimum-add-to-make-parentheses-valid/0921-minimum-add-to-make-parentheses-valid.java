class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character>st = new ArrayDeque<>();
        int addition = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
         else {
            if(st.isEmpty()){
                addition++;
            }
         else {
            st.pop();
        }
         }
        }
        
        int finalAns = addition + st.size();
        return finalAns; 
    }
   
        
}