// Last updated: 16/07/2026, 13:39:15
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        ListNode prev=null;
14        ListNode curr=head;
15        while(curr!=null)
16        {
17            ListNode next=curr;
18            curr=next.next;
19            next.next=prev;
20            prev=next;
21        }
22        return prev;
23    }
24}