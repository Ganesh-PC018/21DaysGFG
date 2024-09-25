class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int maxLen = 0;
        int i=0;
        while(i < arr.length-1){
            int count=0;
            while(i+1 < arr.length && arr[i] < arr[i+1]){
                count++;
                i++;
            }
            i++;
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }
}