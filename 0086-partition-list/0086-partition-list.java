
class Solution {
    public ListNode partition(ListNode head, int x) {
    //      ListNode dummy1 = new ListNode(-1);
    //        ListNode dummy2 = new ListNode(-1);
    //        ListNode temp1 = dummy1;
    //         ListNode temp2 = dummy2;
    //         ListNode temp = head;
    //         while(temp != null){
    //             if(temp.val < x){
    //             temp1.next = temp;
    //             temp1 = temp1.next;
    //         }
    //     else {
    //         temp2.next = temp;
    //         temp2 = temp2.next;
    //     }
    //     temp = temp.next;
    //         }
    //         temp1.next = dummy2.next;
    //        temp2.next = null;
    //         return dummy1.next;



    // }

    ListNode lesserHead = new ListNode(-1);
    ListNode lesserTail = lesserHead;

    ListNode GreaterHead = new ListNode(-1);
    ListNode GreaterTail = GreaterHead;
    ListNode temp = head;

    while(temp != null){
        if(temp.val < x){
        ListNode nodeToinsert = temp;
        temp = temp.next;
        nodeToinsert.next = null;
        lesserTail.next = nodeToinsert;
        lesserTail = nodeToinsert;
        }

     else{ 
        ListNode nodeToinsert = temp;
        temp = temp.next;
        nodeToinsert.next = null;
        GreaterTail.next = nodeToinsert;
        GreaterTail = nodeToinsert;

    }
    
    }
    lesserTail.next = GreaterHead.next;
    GreaterTail.next = null;
    lesserHead = lesserHead.next;
    return lesserHead;
}
}