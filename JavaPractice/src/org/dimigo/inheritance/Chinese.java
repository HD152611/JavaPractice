package org.dimigo.inheritance;

public class Chinese extends Person {
	public Chinese(String name){
		super(name);
	}
	public void sayHello(){
		System.out.println("���Ͽ�");
	}
	
	public void sayBye(){
		System.out.println("¥���");
	}
	public String tostring(){
		return "����" + getName() + "�Դϴ�"; 
	}
}
