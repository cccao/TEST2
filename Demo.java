package com.cl.service;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Random random = new Random();
		String[] name = {"��","��","��","��"};
		int num = (int)(Math.random() * 1000);
		while (num>name.length-1) {
	         if (num<=name.length-1) {
	    break;
	   }
	          num = (int)(Math.random() * 1000);
	  }
	//�������±����ó���������Ϳ���ʵ�������������ȡ
	       System.out.println("���鵽���ǣ�"+name[num]);
	}
}
