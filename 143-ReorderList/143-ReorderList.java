// Last updated: 6/8/2025, 11:13:21 pm
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
    public void reorderList(ListNode head) {
        if(head.next==null){
            return;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        while(mid.next!=null){
            ListNode curr=mid.next;
            mid.next=curr.next;
            curr.next=slow.next;
            slow.next=curr;
        }

        ListNode p1=slow.next;
        ListNode p2=head;
        ListNode nl=new ListNode();
        while(p2!=slow){
            slow.next=p1.next;
            p1.next=p2.next;
            p2.next=p1;
            p2=p1.next;
            p1=slow.next;
        }
        

    }
}