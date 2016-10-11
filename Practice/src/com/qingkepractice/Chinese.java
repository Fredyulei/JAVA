package com.qingkepractice;

public class Chinese extends Person implements Fightable{
	public static void main(String[] args) {

	}

	public static void pinpang() {
		System.out.println("打品乓球");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("会打架");

	}
}