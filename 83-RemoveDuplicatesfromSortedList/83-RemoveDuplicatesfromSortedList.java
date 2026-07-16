// Last updated: 16/07/2026, 13:19:59
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
14        {
15            return head;
16        }
17        ListNode odd=head;
18        ListNode even= head.next;
19        ListNode evenh=even;
20        while(even !=null&&even.next!=null )
21        {
22            odd.next=odd.next.next;
23             even.next=even.next.next;
24            odd=odd.next;
25           
26            even=even.next;
27        }
28        odd.next=evenh;
29        return head;
30    }
31}