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
    public ListNode swapNodes(ListNode head, int k) {
        // ListNode slow = head;
        // ListNode fast = head;
        // for(int i = 1; i<=k; i++){
        //     fast = fast.next;

        // }
        // while(fast!=null){
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        // fast = head;
        // for(int i = 1;i< k;i++){
        //     fast = fast.next;
        // }
        // int temp = fast.val;
        // fast.val = slow.val;
        // slow.val = temp;

        ListNode first = head;
        for(int i = 0;i<(k-1);i++){
            first = first.next;
        }
        ListNode temp = first.next;
        ListNode second = head;
        while(temp != null){
            temp = temp.next;
            second = second.next;
        }

        int tempValue = first.val;
        first.val = second.val;
        second.val = tempValue;
        return head;
    }
}