class Solution {
    public String capitalizeTitle(String title) {
        // StringNuilder t=new StringBuilder(title);
        // title=tile.toLowerCase();
        String arr[]=title.split("\\s+");
        String ans="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=2) ans+=arr[i].toLowerCase()+" ";
            else ans+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
}