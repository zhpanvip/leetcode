package com.zhangpan.designattern.factory;

public class ShapFactory {
	 //ʹ�� getShape ������ȡ��״���͵Ķ���
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equals("Circle")){
	         return new Circle();
	      } else if(shapeType.equals("Rectangle")){
	         return new Rectangle();
	      } else if(shapeType.equals("Triangle")){
	         return new Triangle();
	      }
	      return null;
	   }
}
