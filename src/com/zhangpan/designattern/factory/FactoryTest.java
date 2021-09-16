package com.zhangpan.designattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		ShapFactory shapFactory = new ShapFactory();

		Shape shapeCircle = shapFactory.getShape("Circle");
		shapeCircle.draw();

		Shape shapeRectangle = shapFactory.getShape("Rectangle");
		shapeRectangle.draw();

		Shape shapeTriangle = shapFactory.getShape("Triangle");
		shapeTriangle.draw();

		Shape shapeSquare = shapFactory.getShape("Square");
		if (shapeSquare == null) {
			System.out.println("shapeSquare is null!");
		} else {
			shapeSquare.draw();
		}
		
	}
	
	
}
