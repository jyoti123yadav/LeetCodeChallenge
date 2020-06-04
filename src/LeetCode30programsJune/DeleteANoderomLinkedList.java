package LeetCode30programsJune;

/**
 * 
 * Delete a node from a LinkedList
 * @author jyotiyadav
 *
 */
public class DeleteANoderomLinkedList {

	
//	 Definition for singly-linked list.
	 public class ListNode {
	    int val;
	      ListNode next;
	      ListNode(int x) 
	      
	      { val = x; }
	 
	
	class Solution {
	    public void deleteNode(ListNode node) {
	        node.val=node.next.val;
	        node.next=node.next.next;
	        
	        
	    }
	}
	
}
}