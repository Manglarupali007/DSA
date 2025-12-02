class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String word[]=s.split("\\s+");
        int i=0;
        int j=word.length-1;
        while(i<j){
            String temp=word[i];
            word[i]=word[j];
            word[j]=temp;
            i++;
            j--;
        }
        return String.join(" ",word);
    }
}