package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		
		System.out.println("--<<멜론 챠트>>--");
		printList(list);
		list.add(1,new Music("Signal","트와이스"));
		System.out.println("\n--<<2위 곡 추가>>--");
		printList(list);
		
		list.set(2, new Music("팔레트","아이유"));
		System.out.println("\n--<<3위 곡 변경>>--");
		printList(list);
	
		list.remove(1);
		System.out.println("\n--<<2위 곡 삭제>>--");
		printList(list);
		
		list.clear();
		System.out.println("\n--<<전체 리스트 삭제>>--");
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
