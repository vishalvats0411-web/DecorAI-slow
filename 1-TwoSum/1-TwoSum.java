// Last updated: 20/07/2026, 22:14:32
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int [] ans=new int[2];
4        HashMap<Integer,Integer> hm= new HashMap<>();
5        int n=nums.length;
6        for(int i=0;i<n;i++)
7        {
8            int remaining=target-nums[i];
9            if(hm.containsKey(remaining))
10            {
11                ans[0]=i;
12                ans[1]=hm.get(remaining);
13                break;
14            }
15            hm.put(nums[i],i);
16        }
17        return ans;
18    }
19}