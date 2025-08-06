// Last updated: 6/8/2025, 11:14:33 pm
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
    public ListNode rotateRight(ListNode head, int k) {
        int l = 1;
        ListNode h = head;
        if(k==0 || head==null){
            return head;
        }
        while(h.next!=null){
            h=h.next;
            l++;
        }
        k%=l;
        k=l-k;
        if(k==0){
            return head;
        }
        h.next=head;
        h=head;
        for(int i=1;i<k;i++){
            h=h.next;
        }
        head=h.next;
        h.next=null;
        return head;
    }
}