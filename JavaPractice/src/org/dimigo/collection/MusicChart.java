package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("����?","��Ͼ�"));
		
		System.out.println("--<<��� íƮ>>--");
		printList(list);
		list.add(1,new Music("Signal","Ʈ���̽�"));
		System.out.println("\n--<<2�� �� �߰�>>--");
		printList(list);
		
		list.set(2, new Music("�ȷ�Ʈ","������"));
		System.out.println("\n--<<3�� �� ����>>--");
		printList(list);
	
		list.remove(1);
		System.out.println("\n--<<2�� �� ����>>--");
		printList(list);
		
		list.clear();
		System.out.println("\n--<<��ü ����Ʈ ����>>--");
		printList(list);
	}
private static void printList(List<Music> list){
	int i=0;
	for(Music a : list){
		i = i+1;
		System.out.println(i + ". " + a);
	}
}
}
