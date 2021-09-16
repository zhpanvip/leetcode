package com.zhangpan.designattern.build;

public class BuildTest {
	public static void main(String[] args) {
		PersonDirector personDirector=new PersonDirector();
		Person thinPerson=personDirector.CreatePerson(new PersonThinBuilder());
		System.out.println(thinPerson.getBody());
	}
}
