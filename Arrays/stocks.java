import java.util.*;
public class stocks {

    public static void buyAndSell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int Profit=prices[i]-buyPrice;
                maxProfit=Math.max(Profit, maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String argv[]){
        int prices[]={8,1,5,3,6,4};
        buyAndSell(prices);
    }
}
