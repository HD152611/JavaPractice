/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>  
 * org.dimigo.basic
 *		| _ PrimitiveDataType
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author		: SPC
 * @version		: 1.0
 */
public class PrimitiveDataType {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;
		int age = 24;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
		if(isMale){
			System.out.printf("<< 아이유 프로필 >>\n");
			System.out.printf("이름 : %s\n", name);
			System.out.printf("성별 : %s\n","남자");
			System.out.printf("나이 : %d세\n", age);
			System.out.printf("키 : %.1fcm\n", height);
			System.out.printf("몸무게 : %.1f kg\n", weight);
			System.out.printf("혈액형 : %c \n", bloodtype);
		}
		else{
			System.out.printf("<< 아이유 프로필 >>\n");
			System.out.printf("이름 : %s\n", name);
			System.out.printf("성별 : %s\n","여자");
			System.out.printf("나이 : %d세\n", age);
			System.out.printf("키 : %.1fcm\n", height);
			System.out.printf("몸무게 : %.1f kg\n", weight);
			System.out.printf("혈액형 : %c \n", bloodtype);
		}
	}

}
