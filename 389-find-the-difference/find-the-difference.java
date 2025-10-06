class Solution {
    public char findTheDifference(String s, String t) {
     char[] a=s.toCharArray();
     char[] b=t.toCharArray();
     int sum1=0, sum2=0;
     for(int i=0;i<a.length;i++){
        sum1+=a[i];
     }
     for(int j=0;j<b.length;j++){
        sum2+=b[j];
     }
        return (char)(sum2-sum1);
    }
}