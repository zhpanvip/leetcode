package com.zhangpan.designattern.build;

public class PersonDirector {
	public Person CreatePerson(IDrawPerson buildPerson) {
		buildPerson.drawHead();
		buildPerson.drawBody();
		buildPerson.drawHand();
		buildPerson.drawLeg();
		return buildPerson.buildPerson();
	}

}
