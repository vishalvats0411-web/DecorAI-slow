// Last updated: 16/07/2026, 12:35:07
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode curr=head;
14        while(curr!=null)
15        {
16            ListNode next=curr.next;
17            while(next!=null && curr.val==next.val )
18            {
19                curr.next=next.next;
20                next=next.next;
21            }
22            curr=next;
23        }
24        return head;
25    }
26}