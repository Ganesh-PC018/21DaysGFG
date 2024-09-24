class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        if (s.length() < p.length()) {
            return "-1";
        }
        HashMap<Character,Integer> patternMap = new HashMap<>();
        HashMap<Character,Integer> windowMap = new HashMap<>();
        for(char ch : p.toCharArray()){
            patternMap.put(ch,patternMap.getOrDefault(ch,0)+1);
        }
        int startIndex = 0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        int matched=0;
        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);
            windowMap.put(c,windowMap.getOrDefault(c,0)+1);
            
            if(patternMap.containsKey(c) && windowMap.get(c) <= patternMap.get(c)){
                matched++;
            }
            
            while(matched == p.length()){
                if(minLen > end-start+1){
                    minLen=end-start+1;
                    startIndex = start;
                }
                
                char startChar = s.charAt(start);
                windowMap.put(startChar,windowMap.get(startChar)-1);
                if(patternMap.containsKey(startChar) && windowMap.get(startChar) < patternMap.get(startChar)){
                    matched--;
                    
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "-1" : s.substring(startIndex, minLen + startIndex);
    }
}