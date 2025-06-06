class Solution {
    public String reverseWords(String s) {
        String[] ar=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=ar.length-1;i>=0;i--){
            sb.append(ar[i]);
            if (i != 0) {
                sb.append(" ");
            }

        }
      
        return sb.toString();
    }
}
