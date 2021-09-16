package com.zhangpan.designattern.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		StandardMemberStraegy standar=new StandardMemberStraegy("Standar");
		SilverMemberStrategy silver=new SilverMemberStrategy("Silver");
		GoldenMemberStrategy golden=new GoldenMemberStrategy("Golden");
		Context context=new Context();
		
		context.setStrategy(standar);
		context.executePrice(100);
		
		context.setStrategy(silver);
		context.executePrice(100);
		
		context.setStrategy(golden);
		context.executePrice(100);
	}

}
