package com.mergingtwolists;

import java.util.ArrayList;
import java.util.List;

public class Merge {

	public static void main(String[] args) {

		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		
		List<Integer> l2=new ArrayList<>();
		l2.add(3);
		l2.add(4);
		
		List<Integer> l3=new ArrayList<>(l1);
		l3.addAll(l2);
		
		System.out.println(l3);
	}

}
