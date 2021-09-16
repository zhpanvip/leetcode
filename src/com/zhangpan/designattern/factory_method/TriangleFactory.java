package com.zhangpan.designattern.factory_method;

public class TriangleFactory implements IShapeFactory{

	@Override
	public Shape createShape() {
		return new Triangle();
	}

}
