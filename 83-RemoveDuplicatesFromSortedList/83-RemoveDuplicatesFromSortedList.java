// Last updated: 6/8/2025, 11:14:05 pm
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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer>hs=new HashSet<>();
        ListNode h = head;
        while(h!=null && h.next!=null){
            hs.add(h.val);
            if(hs.contains(h.next.val)){
                h.next=h.next.next;
            }else{
                h=h.next;
            }
        }
        return head;
    }
}