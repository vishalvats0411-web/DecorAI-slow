// Last updated: 19/07/2026, 16:36:33
1class Solution {
2    public String removeDuplicateLetters(String s) {
3int n = s.length();
4
5        int[] lastIdx = new int[26];
6
7        for (int i = 0; i < n; i++) {
8            lastIdx[s.charAt(i) - 'a'] = i;
9        }
10
11        boolean[] visited = new boolean[26];
12        Stack<Character> st = new Stack<>();
13
14        for (int i = 0; i < n; i++) {
15
16            char ch = s.charAt(i);
17
18            if (visited[ch - 'a'])
19                continue;
20
21            while (!st.isEmpty()
22                    && st.peek() > ch
23                    && lastIdx[st.peek() - 'a'] > i) {
24
25                visited[st.pop() - 'a'] = false;
26            }
27
28            st.push(ch);
29            visited[ch - 'a'] = true;
30        }
31
32        StringBuilder sb = new StringBuilder();
33
34        while (!st.isEmpty()) {
35            sb.append(st.pop());
36        }
37
38        return sb.reverse().toString();
39    }
40}