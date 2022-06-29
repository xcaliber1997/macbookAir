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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode j = l1;
        ListNode p = l2;
        int carry = 0;
        while (j != null || p != null)
        {
            int x = j != null ? j.val : 0 ;
            int y = p != null ? p.val : 0 ;
            int sum = x + y + carry ;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            if(p != null){
                p = p.next;
            }
            if(j != null){
                j = j.next;
            }
            curr = curr.next;
        }
        if( carry > 0 ) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next ;
    }
}