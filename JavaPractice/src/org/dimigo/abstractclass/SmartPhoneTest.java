package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] p = {
		new IPhone("iPhone 7","����",900000),
		new Galaxy("������ S8","�Ｚ",800000)
		};
		for(int i = 0 ; i < p.length ; i++){
			System.out.println(p[i]);
			p[i].turnOn();
			p[i].pay();
			p[i].useSpecialFunction();
			p[i].turnOff();
		}
		
	}
}
