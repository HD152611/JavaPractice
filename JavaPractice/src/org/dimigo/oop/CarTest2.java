/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_CarTest
 *   
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		:samsung
 * @version		:1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<자동차 목록>>");
		Car2 car = new Car2("현대자동차","제네시스","검정색",225,50000000);
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : " +car.getColor());
		System.out.println("최대속도 : "+car.getMaxspeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car.getPrice())+"원");
		System.out.println();
		
		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxspeed(246);
//		car2.setPrice(40000000);
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxspeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car2.getPrice())+"원");
		System.out.println();
		
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxspeed(200);
//		car3.setPrice(38000000);
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxspeed()+"km");
		System.out.println("가격 : "+String.format("%,d",car3.getPrice())+"원");
	}

}
