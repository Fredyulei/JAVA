package com.qingke;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args){
		String name;
		System.out.println("���ʲô����");
		//����̨¼��
		Scanner sr = new Scanner(System.in);
		//��һ������
		 name=sr.nextLine();
		//��������+helloworld
		System.out.println(name+"HelloWorld");
		//�ͷ��ڴ�
		sr.close();
	}
	
	

}
