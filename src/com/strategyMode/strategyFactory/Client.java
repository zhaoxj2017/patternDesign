package com.strategyMode.strategyFactory;

public class Client {
	public static void main(String[] args) {
		Player player = new Player();
		player.buy(10000.0);
		Double lastAmount = player.calLastAmount();
		Double totalAmount = player.getTotalAmount();
		
		System.out.println("lastAmount " + lastAmount);
		System.out.println("totalAmount " + totalAmount);
	}
}
