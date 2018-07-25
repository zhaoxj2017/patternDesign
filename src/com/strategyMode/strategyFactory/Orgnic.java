package com.strategyMode.strategyFactory;

@PriceRegion(max = 10000)
public class Orgnic implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice;
	}

}
