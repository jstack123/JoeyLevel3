package com.level3.exercises;

import java.util.ArrayList;

public class StockMarketPrices {
		float maxProfit(ArrayList<Float> stock) {
			float optimalBuy;
			float optimalSell;
			float smallest = stock.get(0);
			float greatest = stock.get(0);
			for (Float fl : stock) {
				if (fl<smallest) {
					smallest=fl;
				}
			}
			for(Float fl2 : stock)
			System.out.println(smallest);
			return smallest;
		}

}

