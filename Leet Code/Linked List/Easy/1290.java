//1290. Convert Binary Number in a Linked List to Integer

//O(n) time and O(1) space
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head!=null){
            sum=(sum<<1)+head.val;
            head = head.next;

        }


        return sum;

    }
}
