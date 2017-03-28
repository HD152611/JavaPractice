/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_Car
 *   
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		:samsung
 * @version		:1.0
 */
public class Car4 {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public Car4() {
	}
	public Car4 (String newCompany, String newModel, String newColor, int newMaxspeed, int newPrice) {
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newMaxspeed;
		this.price = newPrice;
	}
	public Car4 (String newCompany, String newModel, String newColor, int newMaxspeed) {
		this(newCompany,newModel,newColor,0,0);
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newMaxspeed;
		
	}
	public Car4 (String newCompany, String newModel, String newColor) {
		this(newCompany,newModel,newColor,0);
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxspeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
//	public void setCompany(String newCompany){
//		company = newCompany;
//	}
//	public void setModel(String newModel){
//		model = newModel;
//	}
//	public void setColor(String newColor){
//		color = newColor;
//	}
//	public void setMaxspeed(int newMaxspeed){
//		if (newMaxspeed >= 1){
//		maxSpeed = newMaxspeed;
//		}
//	}
//	public void setPrice(int newPrice){
//		if (newPrice >= 1){
//		price = newPrice;
//		}
//	}
}

