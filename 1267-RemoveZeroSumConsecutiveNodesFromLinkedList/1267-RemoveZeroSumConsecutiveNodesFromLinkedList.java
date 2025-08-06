// Last updated: 6/8/2025, 11:09:22 pm
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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode d=new ListNode(0);
        d.next=head;
        int sum=0;
        HashMap<Integer,ListNode> hm=new HashMap<>();
        hm.put(0,d);
        ListNode nn=head;
        while(nn!=null){
            sum+=nn.val;
            if(hm.containsKey(sum)){
                ListNode p=hm.get(sum);
                ListNode rn=p.next;
                int a=sum+(rn!=null?rn.val:0);
                while(rn!=nn){
                    hm.remove(a);
                    rn=rn.next;
                    a+=(rn!=null?rn.val:0);
                }
                p.next=nn.next;
            }
            else{
                hm.put(sum,nn);
            }
            nn=nn.next;
        }
        return d.next;
    }
}