package org.dimigo.exception;

public class Moive {
	private String title;
	private int limitAge;
	
	public Moive(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLimitAge() {
		return limitAge;
	}
	public void setLimitAge(int limitAge) {
		this.limitAge = limitAge;
	}
	
	public void butTicket(int age)throws Exception{
		if(limitAge > age){
			throw new Exception(title+"은/는 "+ limitAge+ "세 이상 관람가입니다.");
		}
		else{
			System.out.println(title+"즐감하세요.");
		}
	}
}
