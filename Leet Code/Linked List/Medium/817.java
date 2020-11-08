//817. Linked List Components


//O(n)

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
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> s = new HashSet<>();
        for(int num : G) {
            s.add(num);
        }
        int count = 0;
        boolean flag = false;
        while(head != null) {
            if(s.contains(head.val)) {
                flag =true;

            }
            else if(flag) {
                count++;
                flag = false;

            }
            head = head.next;
        }
        return flag == true?count+1:count;

    }
}

//O(n)

class Solution {
    public static int numComponents(ListNode head, int[] G) {
        int maxNum = -1;
        for (int num : G) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        boolean[] arr = new boolean[maxNum + 1];
        for (int num : G) {
            arr[num] = true;
        }
        int componentsNum = 0;
        while (head != null) {
            if (head.next == null) {
                if (exist(head.val, arr)) {
                    componentsNum++;
                }
            } else {
                if (exist(head.val, arr) && !exist(head.next.val, arr)) {
                    componentsNum++;
                }
            }
            head = head.next;
        }
        return componentsNum;
    }

    private static boolean exist(int value, boolean[] arr) {
        if (value >= arr.length) {
            return false;
        }
        return arr[value];
    }
}
