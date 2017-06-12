package org.dimigo.collection;

public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSingger() {
		return singer;
	}
	public void setSingger(String singger) {
		this.singer = singer;
	}
	
	public String toString() {
		return title+ "(" + singer +")";
	}
	
	
}
