/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        left=left-1;
         right=right-1;
         ListNode before=null;
         ListNode prev=null;
         ListNode curr=head;
         ListNode next;


       
        
        
        for(int i=0;i<left;i++){
            before=curr;
            
            curr=curr.next;



        }
        ListNode start=curr;

        for(int i=left;i<=right;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
         if (before != null) {
            before.next = prev;
        }

        // reversed part ko 5 se connect
        start.next = curr;

        // agar left = 1 ho
        if (before == null) {
            return prev;
        }

        return head;
    }


    
        
        } 
    
