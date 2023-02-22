import java.util.Scanner;
class StockTransaction

{
	public static void main(String[] args)
	{
Scanner in=new Scanner(System.in);
    System.out.print("Number of shares Joe bought: ");
    int n=in.nextInt();
    System.out.print("Price per share he paid for buying the stock: $");
    double buy_price=in.nextDouble();
    System.out.print("Price per share he got for selling the stock: $");
    double sell_price=in.nextDouble();
    System.out.println();
    double amount_paid=buy_price*n;
    double commission_buy=amount_paid*0.02;
    double amount_got=sell_price*n;
    double commission_sell=amount_got*0.02;
    double profit=amount_got-amount_paid-commission_buy-commission_sell;
	
    System.out.printf("Purchase price: $%.2f\n", amount_paid);
    System.out.printf("Purchase commission: $%.2f\n", commission_buy);
    System.out.printf("Sale price: $%.2f\n", amount_got);
    System.out.printf("Sale commission: $%.2f\n", commission_sell);
    System.out.printf("Profit: $%.2f\n", profit);
	}
}