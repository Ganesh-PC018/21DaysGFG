class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
         PriorityQueue<Long> pq = new PriorityQueue<Long>();
         
         for(long data : arr)
         {
             pq.add(data);
         }
         long sum=0;
         while(pq.size() > 1)
         {
             long first = pq.poll();
            //   System.out.println("first : "+first);
             long second = pq.poll();
            //   System.out.println("sec : "+ second);
             long cost = (first+second);
            //   System.out.println("cost :"+cost);
             sum += cost;//7 8
            //  System.out.println(sum);
            //  System.out.println("cost : "+cost);
             pq.add(cost);//7
            //  System.out.println("PQ : "+pq);
         }
         
         return sum;
        
    }
}