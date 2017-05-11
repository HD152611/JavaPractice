package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("한국사람 홍길동");
		Japanese j = new Japanese("일본사람 다니카");
		Chinese c = new Chinese("중국사람 왕밍");
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c+"\n");
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
		

	}

}
