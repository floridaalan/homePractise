class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int minIndex=0;
        for(int i=0;i<prices.length;i++){
                if(min>prices[i]){
                    min=prices[i];
                    minIndex=i;
                }   
        }
            //max
            max=min;
            for(int i=minIndex+1;i<prices.length;i++){
                    if(max<prices[i]){
                        max=prices[i];
                    }
                }
            int profit=max-min;
            return profit;
    }
}
