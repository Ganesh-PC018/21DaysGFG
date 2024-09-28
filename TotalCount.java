class Solution {
    int totalCount(int[] arr, int n, int k) {
        // code here
        int count =0;
        for(int i=0;i<n;i++)
        {
            int div = arr[i]/k ;
            if(arr[i] % k ==0)
            {    count += div;
            }
            else
            {
                count += div + 1;
            }
        }
        
        return count;
    }
}