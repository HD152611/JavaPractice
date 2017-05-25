package org.dimigo.interfaces;

public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println(ORACLE_DATABASE + "저장");
		
	}

	@Override
	public void search() {
		System.out.println(ORACLE_DATABASE + "조회");
		
	}

	@Override
	public void update() {
		System.out.println(ORACLE_DATABASE + "변경");
		
	}

	@Override
	public void delete() {
		System.out.println(ORACLE_DATABASE + "삭제");
		
	}

}
