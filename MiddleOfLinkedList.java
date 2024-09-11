class Solution {
    // int length(Node head){
    //     int count=0;
    //     while(head != null){
    //         head =head.next;
    //         count++;
    //     }
    //     return count;
    // }
    int getMiddle(Node head) {
        // Your code here.
        // int len = length(head);
        // if (len % 2 == 0){
        //     len = len/2+1;
        // }
        // else{
        //     len = (len/2)+1;
        // }
        // for(int i=1;i<len;i++){
        //     head =head.next;
        // }
        
        // return head.data;
        
        Node slow = head;
        Node fast = head;
        while(slow.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next == null){
                return slow.data;
            }
            if(fast.next.next == null){
                return slow.next.data;
            }
        }
        
        return -1;
    }
}