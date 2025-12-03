class Solution {
    public char findTheDifference(String s, String t) {
     char[] a=s.toCharArray();
     char[] b=t.toCharArray();
     int sum=0;
     for(int i=0;i<b.length;i++){
        sum+=b[i];
     }
     for(int j=0;j<a.length;j++){
        sum-=a[j];
     }
        return (char)(sum);
    }
}