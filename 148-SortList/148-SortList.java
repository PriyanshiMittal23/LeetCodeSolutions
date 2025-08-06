// Last updated: 6/8/2025, 11:13:16 pm
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middle(head);
        ListNode headB=mid.next;
        mid.next=null;
        ListNode A=sortList(head);
        ListNode B=sortList(headB);
        return merge(A,B);
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode headA,ListNode headB){
        ListNode d=new ListNode();
        ListNode t=d;
        while(headA!=null && headB!=null){
            if(headA.val<headB.val){
                t.next=headA;
                t=t.next;
                headA=headA.next;
            }
            else{
                t.next=headB;
                t=t.next;
                headB=headB.next;
            }
        }
        if(headA==null){
            t.next=headB;

        }
        if(headB==null){
            t.next=headA;
        }
        return d.next;
    }
}