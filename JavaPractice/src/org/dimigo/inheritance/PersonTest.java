package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("�ѱ���� ȫ�浿");
		Japanese j = new Japanese("�Ϻ���� �ٴ�ī");
		Chinese c = new Chinese("�߱���� �չ�");
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
