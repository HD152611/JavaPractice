package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] p = {
		new IPhone("iPhone 7","¾ÖÇÃ",900000),
		new Galaxy("°¶·°½Ã S8","»ï¼º",800000)
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
