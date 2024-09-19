class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String arr[] = str.split("\\.");
        StringBuilder sb=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                sb.append(arr[i]);
            }else{
            sb.append(arr[i]+".");
            }
        }
        
        return sb.toString();
    }
}