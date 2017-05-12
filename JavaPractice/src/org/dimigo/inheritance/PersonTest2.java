package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args) {
		Person [] persons = {
				new Person("TOM"),
				new Korean("한국사람 홍길동"),
				new Japanese ("일본사람 다니카"),
				new Chinese ("중국사람 왕밍")
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
