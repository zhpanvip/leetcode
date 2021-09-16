package com.zhangpan.designattern.decorator;


public class DecoratorTest {
	public static void main(String[] args) {
		Shape circle=new Circle();
		Shape redCircle=new RedShapeDecorator(new Circle());
		
		Shape redRectangle=new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("Circle whit red border");
		redCircle.draw();
		
		System.out.println("Rectangle with red border");
		redRectangle.draw();
		
	}
}
