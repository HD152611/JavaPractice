package org.dimigo.inheritance;

public class Chinese extends Person {
	public Chinese(String name){
		super(name);
	}
	public void sayHello(){
		System.out.println("니하오");
	}
	
	public void sayBye(){
		System.out.println("짜이찌엔");
	}
	public String tostring(){
		return "저는" + getName() + "입니다"; 
	}
}
