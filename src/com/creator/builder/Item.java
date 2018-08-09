package com.creator.builder;

import com.creator.builder.items.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
