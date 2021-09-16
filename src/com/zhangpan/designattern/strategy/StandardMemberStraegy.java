package com.zhangpan.designattern.strategy;

public class StandardMemberStraegy extends Strategy {
	
	public StandardMemberStraegy(String strategy) {
		super(strategy);
	}

	@Override
	public double getPrice(double normalPrice) {
		return 0.9*normalPrice;
	}
}
