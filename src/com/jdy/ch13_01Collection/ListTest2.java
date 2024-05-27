package com.jdy.ch13_01Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memebrList = new ArrayList<Member>();
		
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setPw("12345");
		member1.setName("홍길동");
		member1.setAge(29);
		member1.setPhone("010-1234-5678");
		
		Member member2 = new Member();
		member2.setId("lion");
		member2.setPw("12645");
		member2.setName("이순신");
		member2.setAge(33);
		member2.setPhone("010-5555-5678");
		
		Member member3 = new Member("seahorse", "65746", "장보고", 43,"010-4985-8756");
		// --------------------------------------------------------------------------
		
		memebrList.add(member1);
		memebrList.add(member2);
		memebrList.add(member3);
		
		if (memebrList.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
	}

}
