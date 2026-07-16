// Last updated: 16/07/2026, 13:20:42
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null)
14            return head;
15        ListNode odd=head;
16        ListNode nextHead=head.next;
17        ListNode even=nextHead;
18        while(odd!=null && even!=null && odd.next!=null && even.next!=null && odd.next.next!=null )
19        {
20            odd.next=odd.next.next;
21            even.next=even.next.next;
22            odd=odd.next;
23            even=even.next;
24        }
25        odd.next=nextHead;
26        return head;
27    }
28}