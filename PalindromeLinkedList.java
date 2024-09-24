class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Node curr = head;
        Node reverseHead=reverse(head);
        while(curr != null){
            if(curr.data != reverseHead.data){
                return false;
            }
            curr = curr.next;
            reverseHead = reverseHead.next;
        }
        
        return true;
    }
    
    private Node reverse(Node root){
        Node curr = root;
        Node prev = null;
        Node nextNode = null;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}