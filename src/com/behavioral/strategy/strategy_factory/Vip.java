package com.behavioral.strategy.strategy_factory;

@PriceRegion(max = 20000)
public class Vip implements CalPrice{

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return 0.8*orgnicPrice;
	}

}
