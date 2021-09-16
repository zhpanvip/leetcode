package com.zhangpan.designattern.factory_method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Shape circle=new CircleFactory().createShape();
		circle.draw();
		Shape trangle=new TriangleFactory().createShape();
		trangle.draw();
	}

}
