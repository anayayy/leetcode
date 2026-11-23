class Solution {
    String[] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String ans="";
        if(num>=1000000000){
            ans=small(num/1000000000)+" Billion";
            num=num%1000000000;
        }
        if(num>=1000000){
            if(ans.length()>0) ans=ans+" ";
            ans=ans+small(num/1000000)+" Million";
            num=num%1000000;
        }
        if(num>=1000){
            if(ans.length()>0) ans=ans+" ";
            ans=ans+small(num/1000)+" Thousand";
            num=num%1000;
        }
        if(num>0){
            if(ans.length()>0) ans=ans+" ";
            ans=ans+small(num);
        }
        return ans;
    }

    public String small(int n) {
        String s="";
        if(n>=100){
            s=ones[n/100]+" Hundred";
            n=n%100;
        }
        if(n>=20){
            if(s.length()>0) s=s+" ";
            s=s+tens[n/10];
            n=n%10;
        }
        if(n>0){
            if(s.length()>0) s=s+" ";
            s=s+ones[n];
        }
        return s;
    }
}
