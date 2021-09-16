package com.zhangpan.designattern.build;

public class PersonThinBuilder implements IDrawPerson {
	private Person mPerson;
	
	public PersonThinBuilder() {
		super();
		mPerson=new Person();
	}

	@Override
	public void drawHead() {
		mPerson.setHead("draw head");
		
	}

	@Override
	public void drawBody() {
		mPerson.setBody("draw thin body");
	}

	@Override
	public void drawHand() {
		mPerson.setHand("draa hand");
	}

	@Override
	public void drawLeg() {
		mPerson.setLeg("draw leg");
	}

	@Override
	public Person buildPerson() {
		return mPerson;
	}
}
