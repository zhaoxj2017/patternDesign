package com.creator.builder.items;

import com.creator.builder.Item;

/**
 * @author 赵兴君_F
 */
public abstract class AbstractBurger implements Item {
	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
