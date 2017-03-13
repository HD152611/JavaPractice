/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>  
 * org.dimigo.basic
 *		| _ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author		: 박권수
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long monthmoney = 1700000l;
		int a =5;
		int people = 3;
		int store = 1500;
		long total = monthmoney * 12 * people * store;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",monthmoney));
		System.out.println("점포 내 직원 수 : "+String.format("%,d",people));
		System.out.println("점포 수 : "+String.format("%,d",store));
		System.out.println("\n연간 인건비 : "+String.format("%,d",total));

	}

}
