package com.structural.adapter.inheritance;

public class Adapter extends Ps2er implements USB {

	@Override
	public void isUsb() {
		// TODO Auto-generated method stub
		isPs2();
	}
}
