package com.jdy.ch13_01Collection;

import java.util.*;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();  // arrayList 선언
		
		list1.add("홍길동");  // 리스트에 객체(원소) 추가
		list1.add("이순신");
		list1.add("김유신");
		
		int list1Size = list1.size();
		
		String memberName = list1.get(1);
		// System.out.println(memberName);
		
		for (int i=0;i<list1.size();i++) {  
			System.out.println(list1.get(i));
		}
		//-------------------------------------------------
		list1.remove(1);
		list1.remove("홍길동");
		
		for (int i=0;i<list1.size();i++) {  
			System.out.println(list1.get(i));
		}
		
		
		
		
		
	}
}
