package org.dimigo.exception;

public class MoiveTest {

	public static void main(String[] args) {
	
		Moive[] movies = {
				new Moive("���̸���:Ŀ����Ʈ",15),
				new Moive("������� ���� ������",12)
		};
		
		int age = 13;
		for(Moive moive: movies){
			try{
				moive.butTicket(age);
			}catch(Exception e){
				System.out.println(e.getMessage()
						);
			}
		}
	}
}