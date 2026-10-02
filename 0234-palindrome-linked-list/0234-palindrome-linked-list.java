class Solution {
//     public ListNode getmid(ListNode head){
//         ListNode slow=head;
//         ListNode fast=head.next;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//     }
//     return slow;
// }
    public boolean isPalindrome(ListNode head) {
        // if(head==null||head.next==null){
        //     return true;
        // }
        // ListNode midNode= getmid(head);
        // ListNode prev=null;
        // ListNode curr=midNode.next;
        // ListNode next;
        // while(curr!=null){
        //     next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next;
        // }
        // ListNode right=prev;
        // ListNode left =head;

        // while(right!=null){
        //     if(left.val!=right.val){
        //         return false;
        //     }
        //     left=left.next;
        //     right=right.next;
        // }
        // return true;
        Stack <Integer> st= new Stack<>();
         ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
    }
        if (fast != null) {
            slow = slow.next;
    }
    while(slow!=null){
        if(st.pop()!=slow.val){
            return false;
        }
        slow=slow.next;
    }
        return true;
    }
}
