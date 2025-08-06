// Last updated: 6/8/2025, 11:12:43 pm
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
    public ListNode reverseList(ListNode head) {
        ListNode ans=reverse(head);
        return ans;
    }

    public ListNode reverse(ListNode head){
        ListNode n=null;
        ListNode nn=head;
        while(nn!=null){
            ListNode cn=nn.next;
            nn.next=n;
            n=nn;
            nn=cn;
        }
        return n;
    }
}