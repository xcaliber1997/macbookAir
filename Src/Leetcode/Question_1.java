public class Question_1 {

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = null;
        ListNode curr = dummyHead, j = l1 , p =l2;
        int carry = 0 ;
        while (j.next != null || p.next != null){
            if(j.next == null) {

            }
            if(p.next == null) {

            }
            j = j.next;
            p = p.next;

        }
    }
}