class Solution {                                     //2ms
    public void reverseString(char[] s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s){
            sb.append(ch);//hello
        }
        sb.reverse(); //olleh

        for(int i=0;i<s.length;i++){
            s[i]=sb.charAt(i);
        }
    }
}
