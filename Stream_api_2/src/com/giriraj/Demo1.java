// How to generate Streams
package com.giriraj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		
		System.out.println("_____Stream from List_____");
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//list.stream().forEach((Integer data)-> System.out.println(data));
		list.stream().forEach( System.out::println);
		
		
		System.out.println("_____Stream from Set_____");
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		//set.stream().forEach((Integer data)-> System.out.println(data));
		set.stream().forEach( System.out::println);
		
		
		
		System.out.println("_____Stream from Map_____");
		Map<Integer,String> map = new HashMap<>();
		map.put(10,"zyna");
		map.put(20,"giri");
		map.put(30,"dev");
		map.entrySet().stream().forEach( System.out::println);	
		
	}

}