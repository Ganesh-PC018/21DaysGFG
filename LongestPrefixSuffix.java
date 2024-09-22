class Solution {
    int lps(String str) {
        // code here
        int visited[] = new int[str.length()];
        int start = 0;
        int end = 1;
        if(str.length() < 2){
            return 0;
        }
        char newArr[] = str.toCharArray();
        while(end < str.length()){
           if(str.charAt(end) == str.charAt(start)){
               start++;
               visited[end] = start;
               end++;
           }else{
               if(start != 0){
                   start = visited[start-1];
               }else{
                   visited[end] = 0;
                   end++;
               }
           }
        }
        
        return visited[str.length()-1];
    }
}