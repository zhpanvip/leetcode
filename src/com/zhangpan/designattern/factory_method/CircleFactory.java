package com.zhangpan.designattern.factory_method;

public class CircleFactory implements IShapeFactory{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
