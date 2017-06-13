package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicGenreChart {

	public static void main(String[] args) {
		Map<String,List<Music>> map = new HashMap<>();
		List<Music> list1 = new ArrayList<>();
		List<Music> list2 = new ArrayList<>();
		list1.add(new Music("�ȷ�Ʈ","������"));
		list2.add(new Music("I LUV IT","PSY"));
		list2.add(new Music("����?","��Ͼ�"));
		map.put("�߶��", list1);
		map.put("��", list2);
		System.out.println("--<<��� �帣�� íƮ>>--");
		printMap(map);
		
		System.out.println("\n--<<��� 2�� �� ����>>--");
		list2.set(1, new Music("SIGNAL","Ʈ���̽�"));
		map.put("��", list2);
		printMap(map);
		
		System.out.println("\n--<<�� 1�� �� ����>>--");
		list2.remove(0);
		map.put("��", list2);
		printMap(map);
		
		System.out.println("\n--<<��ü ����Ʈ ����>>--");
		map.clear();
		printMap(map);
	}
	private static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet() ){
			int i = 1;
			System.out.println("["+key+"]");
			for(Music value : map.get(key)){
				System.out.println(i+". "+value);
				i=i+1;
			}
		}
	
	}
}