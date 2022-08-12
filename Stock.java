package Stocks;

public class Stock {
	//declaring variables
	private int shares;
	private double price, capital, money;
	//creating the method buy and sell
	public void buy (double p, int s) {
		shares += s;
		price = p;
		capital += p * s;
		money -= p * s;
		System.out.println("You bought " + s + " shares at price $" + p + " your capital is $" + capital + " and your money is $" + money);
	}
	public void sell (double p, int s) {
		shares -= s;
		price = p;
		capital -= p * s;
		money += p * s;
		System.out.println("You sold " + s + " shares at price $" + p + " your capital is $" + capital + " and your money is $" + money);
	}
	// creating get variables to maintain private
	public int getShares () {
		return shares;
	}
	
	public double getPrice () {
		return price;
	}
	
	public double getCapital () {
		if (shares == 0) {
			System.out.println("Your capital is $0");
			return shares;
		}
		else {
			return capital;
		}
	}
	
	public double getMoney () {
		return money;
	}
	
	public double getAveragePrice () {
		return capital / getShares ();
	}
}
