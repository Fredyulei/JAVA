package com.qingke;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args){
		String name;
		System.out.println("你叫什么名字");
		//控制台录入
		Scanner sr = new Scanner(System.in);
		//下一行名字
		 name=sr.nextLine();
		//输入名字+helloworld
		System.out.println(name+"HelloWorld");
		//释放内存
		sr.close();
	}
	
	

}
