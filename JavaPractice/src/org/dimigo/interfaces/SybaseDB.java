package org.dimigo.interfaces;

public class SybaseDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println(SYBASE_DATABASE + "����");
		
	}

	@Override
	public void search() {
		System.out.println(SYBASE_DATABASE + "��ȸ");
		
	}

	@Override
	public void update() {
		System.out.println(SYBASE_DATABASE + "����");
		
	}

	@Override
	public void delete() {
		System.out.println(SYBASE_DATABASE + "����");
		
	}

}
