package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args) {
		Person [] persons = {
				new Person("TOM"),
				new Korean("�ѱ���� ȫ�浿"),
				new Japanese ("�Ϻ���� �ٴ�ī"),
				new Chinese ("�߱���� �չ�")
		};
		for(Person person : persons){
			System.out.println(person);
			person.sayHello();
			person.sayBye();
			System.out.println();
		}
//		System.out.println(p);
//		System.out.println(k);
//		System.out.println(j);
//		System.out.println(c+"\n");
//		p.sayHello();
//		k.sayHello();
//		j.sayHello();
//		c.sayHello();
//		System.out.println();
//		p.sayBye();
//		k.sayBye();
//		j.sayBye();
//		c.sayBye();
//		

	}

}
