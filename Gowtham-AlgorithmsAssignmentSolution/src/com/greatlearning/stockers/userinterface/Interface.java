package com.greatlearning.stockers.userinterface;

import com.greatlearning.stockers.model.Stocks;

interface Interface{

	Stocks[] buildStockInfo();
	void displayOptions();
	void displayStocks(Stocks[] stocks);

}