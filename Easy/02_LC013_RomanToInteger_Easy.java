class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int n=0;
            char c=s.charAt(i);
            if(c=='I') n=1;
            else if(c=='V') n=5;
            else if(c=='X') n=10;
            else if(c=='L') n=50;
            else if(c=='C') n=100;
            else if(c=='D') n=500;
            else n=1000;

            if(n<prev) ans=ans-n;
            else ans=ans+n;
            prev=n;
        }
        return ans;
    }
}
