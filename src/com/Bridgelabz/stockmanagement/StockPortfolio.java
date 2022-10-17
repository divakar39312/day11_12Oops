package com.Bridgelabz.stockmanagement;

import java.util.Scanner;

//public class StockPortfolio {

	public class StockPortfolio extends Stock {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Stocks");
			setNoOfStocks(sc.nextInt());
			for (int i = 1; i <= getNoOfStocks(); i++) {
				Stock st = new Stock();
				st.addShare();
				TotalValue += StockPrice;
			}
			System.out.println("\nTotal Value is " + TotalValue);
		}
}
