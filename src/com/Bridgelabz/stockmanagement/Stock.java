package com.Bridgelabz.stockmanagement;

import java.util.Scanner;

public class Stock {

	private static int noOfStocks;
	private static String shareName;
	private static int noOfShare;
	private static int sharePrice;
	static int StockPrice;
	static int TotalValue;

	public static int getNoOfStocks() {
		return noOfStocks;
	}

	public static void setNoOfStocks(int noOfStocks) {
		Stock.noOfStocks = noOfStocks;
	}

	public static String getShareName() {
		return shareName;
	}

	public static void setShareName(String shareName) {
		Stock.shareName = shareName;
	}

	public static int getNoOfShare() {
		return noOfShare;
	}

	public static void setNoOfShare(int noOfShare) {
		Stock.noOfShare = noOfShare;
	}

	public static int getSharePrice() {
		return sharePrice;
	}

	public static void setSharePrice(int sharePrice) {
		Stock.sharePrice = sharePrice;
	}
	
	public void addShare() {

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the Name of Share");
		shareName = input.nextLine();
		System.out.println("Enter the number of Share");
		noOfShare = input.nextInt();
		System.out.println("Enter the price for Share");
		sharePrice = input.nextInt();
		StockPrice = noOfShare * sharePrice;
		System.out.println("\nValue of Stock " + shareName + " is = " + StockPrice);
	}
}
