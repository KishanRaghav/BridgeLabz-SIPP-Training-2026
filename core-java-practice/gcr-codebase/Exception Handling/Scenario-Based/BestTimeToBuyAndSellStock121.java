class BestTimeToBuyAndSellStock121{
    public int maxProfit(int[] prices){
        int min=prices[0],profit=0;
        for(int p:prices){min=Math.min(min,p);profit=Math.max(profit,p-min);}
        return profit;
    }
}