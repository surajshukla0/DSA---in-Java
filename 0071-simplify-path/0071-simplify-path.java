class Solution {
    public String simplifyPath(String path) {
        Deque<String>st = new ArrayDeque<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.isEmpty()){
                continue;
            }
            if(part.equals(".")){
                continue;

            }
            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.removeLast();
                }
            } else {
                st.addLast(part);
            }
        
        }
        if(st.isEmpty()){
            return "/";
        } else {
        StringBuilder result = new StringBuilder();

        for (String dir : st) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
    
}