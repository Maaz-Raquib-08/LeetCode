class Solution {
    public ListNode mergeTwoLists(ListNode left, ListNode right) {
        ListNode mergedll = new ListNode(-1);
        ListNode temp = mergedll;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedll.next;

    }
}