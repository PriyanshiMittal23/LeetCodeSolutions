// Last updated: 1/11/2025, 10:22:29 pm
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode ln = new ListNode();
        ln.next = head;
        ListNode p = ln;
        HashSet<Integer> hs = new HashSet<>();
        for(int a:nums){
            hs.add(a);
        }
        while(head!=null){
            int n = head.val;
            if(hs.contains(n)){
                p.next = head.next;
            }else{
                p = head;
            }
            head = head.next;
        }
        return ln.next;
    }
}