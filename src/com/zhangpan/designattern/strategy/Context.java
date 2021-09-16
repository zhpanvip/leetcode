package com.zhangpan.designattern.strategy;

public class Context {
	private Strategy mStrategy;
	
	public void setStrategy(Strategy strategy) {
		mStrategy=strategy;
	}
	
	public double executePrice(double normalPrice) {
		System.out.println(mStrategy.getStrategy()+"Member���ۺ�ۣ�"+mStrategy.getPrice(normalPrice));
		return mStrategy.getPrice(normalPrice);
	}
}
