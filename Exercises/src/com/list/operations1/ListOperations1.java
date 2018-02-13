package com.list.operations1;

import java.util.ArrayList;
import java.util.List;

public class ListOperations1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("foo"); /*[foo]*/
		
		List<String> list2 = list1; /*[foo]*/
		List<String> list3 = new ArrayList<>(list2);/*[foo]. But this is a different reference.*/
		
		list1.clear(); /*[]. Also List2 is []*/
		list2.add("bar");/*Both List1 and List 2 are [bar]*/
		list3.add("baz");/*List3 is [foo, baz]*/
		
		System.out.println(list1);//[bar]
		System.out.println(list2);//[bar]
		System.out.println(list3);//[foo, baz]
	}

}
