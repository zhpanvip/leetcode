package com.zhangpan.designattern.strategy;

public abstract class Strategy {
	
	private String strategy;
	
	
	public String getStrategy() {
		return strategy;
	}



	public Strategy(String strategy) {
		super();
		this.strategy = strategy;
	}
	
	abstract double getPrice(double normalPrice);
}
