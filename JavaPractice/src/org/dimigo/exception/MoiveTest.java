package org.dimigo.exception;

public class MoiveTest {

	public static void main(String[] args) {
	
		Moive[] movies = {
				new Moive("에이리언:커버넌트",15),
				new Moive("가디언즈 오브 갤럭시",12)
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