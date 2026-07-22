// Last updated: 22/07/2026, 23:56:27
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3         int n = s.length();
4
5        // existing count of 1s
6        int activeCount = 0;
7        for (int i = 0; i < n; i++) {
8            if (s.charAt(i) == '1') activeCount++;
9        }
10
11        List<Integer> inactiveBlocks = new ArrayList<>();
12        int i = 0;
13        while (i < n) {
14            if (s.charAt(i) == '0') {
15                int start = i;
16                while (i < n && s.charAt(i) == '0') i++;
17
18                inactiveBlocks.add(i - start);
19            } else {
20                i++;
21            }
22        }
23
24        int maxPairSum = 0;
25        // max(inactiveBlocks[i] + inactiveBlocks[i-1])
26        for (int j = 1; j < inactiveBlocks.size(); j++) {
27            maxPairSum = Math.max(maxPairSum, inactiveBlocks.get(j) + inactiveBlocks.get(j - 1));
28        }
29
30        return maxPairSum + activeCount;
31    }
32}