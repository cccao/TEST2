package com.cl.service;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Random random = new Random();
		String[] name = {"王","曹","韩","于"};
		int num = (int)(Math.random() * 1000);
		while (num>name.length-1) {
	         if (num<=name.length-1) {
	    break;
	   }
	          num = (int)(Math.random() * 1000);
	  }
	//将数组下标设置成随机数，就可以实现人名的随机抽取
	       System.out.println("被抽到的是："+name[num]);
	}
}
//edit
