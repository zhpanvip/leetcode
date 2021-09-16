package com.zhangpan.designattern.adapter;

public class LocationAdapter implements Map {
	@Override
	public String getLocation(String mapType) {
		String location="";
		switch(mapType) {
			case "Baidu":
				location=new BaiduMap().getBaiduLocation();
				break;
			case "Google":
				location=new GoogleMap().getGoogleLocation();
				break;
		}
		return location;
	}
}
