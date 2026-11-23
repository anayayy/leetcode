class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] used=new boolean[128];
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            while(used[s.charAt(i)]){
                used[s.charAt(left)]=false;
                left++;
            }
            used[s.charAt(i)]=true;
            if(i-left+1>ans) ans=i-left+1;
        }
        return ans;
    }
}
