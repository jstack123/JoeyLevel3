package com.level3.exercises;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StockMarketPricesTest {

	@Test
	public void maxProfit() {
		ArrayList<Float> s = new ArrayList<Float>(Arrays.asList(100.05f,2f,10.09f,3.53f));
		StockMarketPrices prices = new StockMarketPrices();
		assertTrue(prices.maxProfit(s)==2f);
	}

}
