package com.structural.adapter.injection;

public class Adapter  implements USB {
	private PS2 ps2;
	
	public Adapter(PS2 ps2) {
		this.ps2 = ps2;
	}
	
	@Override
	public void isUsb() {
		// TODO Auto-generated method stub
		ps2.isPs2();
	}
}
