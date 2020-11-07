//160. Intersection of Two Linked Lists

//O(n)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if(headA == null || headB == null) return null;

    ListNode atrav = headA;
    ListNode btrav = headB;


    while( atrav != btrav){

        atrav = atrav == null? headB : atrav.next;
        btrav = btrav == null? headA : btrav.next;
    }

    return atrav;

    }
}
