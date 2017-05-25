package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		System.out.println("<<변경 전>>");
		IDBManager database = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(database);
		System.out.println("\n<<변경 후>>");
		IDBManager database1 = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(database1);
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
