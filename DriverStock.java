package Stocks;

public class DriverStock {

	public static void main(String[] args) {
		Stock ABCcompany = new Stock ();
		ABCcompany.buy(2, 2000);
		ABCcompany.sell(3, 1000);
		System.out.println(ABCcompany.getPrice());
		System.out.println(ABCcompany.getShares());
		System.out.println(ABCcompany.getCapital());
		System.out.println(ABCcompany.getMoney());
		System.out.println(ABCcompany.getAveragePrice());
	}
}
