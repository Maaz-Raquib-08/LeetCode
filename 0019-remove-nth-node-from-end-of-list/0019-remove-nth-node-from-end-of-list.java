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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int idx=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            idx++;
        }
        if(n==idx){
            head=head.next;
            return head;
        }
        int i=1;
        int m=idx-n;
        ListNode prev=head;
        while(i<m){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}