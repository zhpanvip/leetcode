package com.zhangpan.designattern.strategy;

public class GoldenMemberStrategy extends Strategy {


	public GoldenMemberStrategy(String strategy) {
		super(strategy);
	}

	@Override
	public double getPrice(double normalPrice) {
		return 0.7*normalPrice;
	}
	
}
