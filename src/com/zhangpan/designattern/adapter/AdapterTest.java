package com.zhangpan.designattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		LocationAdapter adapter=new LocationAdapter();
		System.out.println(adapter.getLocation("Baidu"));
		System.out.println(adapter.getLocation("Google"));
	}

}
