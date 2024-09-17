class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
         Arrays.sort(arr);
         int n= arr.length;
        int diff = arr[n-1] - arr[0];//9
        int smallest = arr[0]+k;//3
        int largest = arr[n-1]-k;//8
        for(int i=0;i<n-1;i++)
        {
            int min = Math.min(smallest,arr[i+1]-k);//3
            int max = Math.max(largest,arr[i]+k);//10
            
            if(min < 0)
                continue;
            
            diff = Math.min(diff,max-min);//5
        }
        
        return diff;
    }
}
