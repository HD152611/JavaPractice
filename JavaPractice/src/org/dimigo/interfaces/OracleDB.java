package org.dimigo.interfaces;

public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println(ORACLE_DATABASE + "����");
		
	}

	@Override
	public void search() {
		System.out.println(ORACLE_DATABASE + "��ȸ");
		
	}

	@Override
	public void update() {
		System.out.println(ORACLE_DATABASE + "����");
		
	}

	@Override
	public void delete() {
		System.out.println(ORACLE_DATABASE + "����");
		
	}

}
