// Last updated: 6/8/2025, 11:12:47 pm
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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode dup=head;
        while(dup!=null && dup.next!=null){
            if(dup.next.val==val){
                dup.next=dup.next.next;
            }
            else{
                dup=dup.next;
            }
        }
        return head;
    }
}