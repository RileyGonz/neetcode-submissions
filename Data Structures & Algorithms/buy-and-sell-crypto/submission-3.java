class Solution {
    public int maxProfit(int[] prices) {
        int pointer1 = 0;
        int pointer2 = 1;
        int max = 0;
        while(pointer1 != prices.length && pointer2 != prices.length){
            if(prices[pointer2]-prices[pointer1] <= 0){
                if(prices[pointer1]>prices[pointer2]){
                    pointer1++;
                }else{
                    pointer2++;
                }
            }else if(prices[pointer2]-prices[pointer1] >= 0){
                if(prices[pointer2]-prices[pointer1] > max){
                    max = prices[pointer2]-prices[pointer1];
                }
                pointer2++;
            }
        }
        return max;
    }
}
