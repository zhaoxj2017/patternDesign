package com.creator.builder.items;

import com.creator.builder.Item;

/**
 * @author 赵兴君_F
 */
public abstract class AbstractColdDrink implements Item {

	/**
	 * name something
	 * @return
	 */
	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/**
	 * price
	 * @return
	 */
	@Override
	public abstract float price();

}
