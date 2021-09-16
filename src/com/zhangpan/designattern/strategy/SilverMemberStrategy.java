package com.zhangpan.designattern.strategy;

public class SilverMemberStrategy extends Strategy{

	public SilverMemberStrategy(String strategy) {
		super(strategy);
	}

	@Override
	public double getPrice(double normalPrice) {
		return 0.8*normalPrice;
	}

}
