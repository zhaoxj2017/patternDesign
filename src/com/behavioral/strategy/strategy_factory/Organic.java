package com.behavioral.strategy.strategy_factory;

/**
 * @author 赵兴君_F
 */
@PriceRegion(max = 10000)
public class Organic implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		// TODO Auto-generated method stub
		return orgnicPrice;
	}

}
