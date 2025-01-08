public class BestTimeBuyandSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
     int l=0,r=1;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                max = Math.max(max,prices[r]-prices[l]);
            }else{
                l=r;
            }
            r++;

        }
return max;
    }
}
