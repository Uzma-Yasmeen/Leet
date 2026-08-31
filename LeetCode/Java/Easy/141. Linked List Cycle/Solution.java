/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int pos=-1;
        while(temp!=null)
        {
            if(fast == slow && pos>=0) return true;
            pos++;
            fast =
            temp = temp.next;
        }
        return false;
    }
}