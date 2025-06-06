class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs((long)x)); 
        sb.reverse();
        
        try {
            long reversed = Long.parseLong(sb.toString());
            if (reversed > Integer.MAX_VALUE) {
                return 0;
            }
            return isNegative ? (int)-reversed : (int)reversed;
        } catch (NumberFormatException e) {
            return 0; 
        }
    }
}
