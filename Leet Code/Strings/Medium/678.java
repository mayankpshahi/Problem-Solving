//678. Valid Parenthesis String

//O(n)time and O(1)space
class Solution {
    public boolean checkValidString(String s) {
        int lower = 0;
        int higher = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lower++;
                higher++;
            } else if (s.charAt(i) == ')') {
                if (lower > 0) {
                    lower--;
                }
                higher--;
            } else {
                if (lower > 0) {
                    lower--;
                }
                higher++;
            }
            if (higher < 0) {
                return false;
            }
        }
        if(lower==0) return true;
        else return false;
        
    }
}
// Logic used in above Solution
/*The idea is to similar to validate a string only contains '(' and ')'. But extend it to tracking the lower and upper bound of valid '(' counts. My thinking process is as following.

scan from left to right, and record counts of unpaired ‘(’ for all possible cases. For ‘(’ and ‘)’, it is straightforward, just increment and decrement all counts, respectively.
When the character is '*', there are three cases, ‘(’, empty, or ‘)’, we can think those three cases as three branches in the ongoing route.
Take “(**())” as an example. There are 6 chars:
----At step 0: only one count = 1.
----At step 1: the route will be diverted into three branches.
so there are three counts: 1 - 1, 1, 1 + 1 which is 0, 1, 2, for ‘)’, empty and ‘(’ respectively.
----At step 2 each route is diverged into three routes again. so there will be 9 possible routes now.
-- For count = 0, it will be diverted into 0 – 1, 0, 0 + 1, which is -1, 0, 1, but when the count is -1, that means there are more ‘)’s than ‘(’s, and we need to stop early at that route, since it is invalid. we end with 0, 1.
-- For count = 1, it will be diverted into 1 – 1, 1, 1 + 1, which is 0, 1, 2
-- For count = 2, it will be diverted into 2 – 1, 2, 2 + 1, which is 1, 2, 3
To summarize step 2, we end up with counts of 0,1,2,3
----At step 3, increment all counts --> 1,2,3,4
----At step 4, decrement all counts --> 0,1,2,3
----At step 5, decrement all counts --> -1, 0,1,2, the route with count -1 is invalid, so stop early at that route. Now we have 0,1,2.
In the very end, we find that there is a route that can reach count == 0. Which means all ‘(’ and ‘)’ are cancelled. So, the original String is valid.
Another finding is counts of unpaired ‘(’ for all valid routes are consecutive integers. So we only need to keep a lower and upper bound of that consecutive integers to save space.
One case doesn’t show up in the example is: if the upper bound is negative, that means all routes have more ‘)’ than ‘(’ --> all routes are invalid --> stop and return false.
*/


//Using stack
class Solution {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public boolean checkValidString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                stack1.push(i);
            } else if (c == ')') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                } else if(!stack2.isEmpty()) {
                    stack2.pop();
                } else {
                    return false;
                }
            } else if (c == '*') {
                stack2.push(i);
            }
        }

        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            Integer value = stack2.pop();
            if (stack1.peek() < value) {
                stack1.pop();
            }
        }

        return stack1.isEmpty();
    }
}