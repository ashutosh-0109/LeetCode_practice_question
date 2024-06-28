class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums2.length;i++) {
            mp.put(nums2[i],i);
        }
        Stack<Integer>st=new Stack<>();
        int[] temp1=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&&nums2[i]>=st.peek()) st.pop();
            if(st.isEmpty()) temp1[i]=-1;
            else temp1[i]=st.peek();
            st.push(nums2[i]);
        }
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) ans[i]=temp1[mp.get(nums1[i])];
        return ans;
    }
}