class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int maxSoFar=0;
        if(k==0)
            return 0;
            
        int sum=0;
        int n=arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++){
                if(i+j < n){
                    dp[i+j] = Math.min(dp[i+j],dp[i]+Math.abs(arr[i]-arr[i+j]));
                }
            }
        }
        
        return dp[n-1];
    }
}