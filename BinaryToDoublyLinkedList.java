class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head=null;
    Node prev = null;
    Node bToDLL(Node root)
    {
	//  Your code here	
    head = null;
    prev = null;
    convertToDLL(root);
    return head;
    }   
    private void convertToDLL(Node root){
        if(root == null)
                return;
        convertToDLL(root.left);
        if(prev == null){
            head =root;//25
        }else{
            root.left = prev;//25
            prev.right = root;
        }
        
        prev =root;//25
        convertToDLL(root.right);
    }

}