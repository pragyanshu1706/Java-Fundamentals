public class ProfitPercent{
	public static void main(String[] args){
		int costPrice = 121;
		int sellingPrice = 191;
		int profit = sellingPrice - costPrice;
		double profitPercent = profit * 100 / costPrice;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	}
}
