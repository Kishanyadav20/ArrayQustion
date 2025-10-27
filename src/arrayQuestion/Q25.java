package arrayQuestion;
// best time to buy and sell stock
public class Q25 {
	public static void main(String[] args) {
		int[] arr = {7,1,5,6,4,3};
		
		System.out.println("Max Profit is :"+bestTimeByAndSellStock(arr));
		
	}
	public static int  bestTimeByAndSellStock(int[] arr) {
		int minPrice =Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int price:arr) {
			if(price<minPrice) {
				minPrice = price;
			}
			else if(price-minPrice>maxProfit) {
				maxProfit = price-minPrice;
			}
		}
		return maxProfit;
	}

}
