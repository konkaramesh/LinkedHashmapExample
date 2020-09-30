package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("Ramesh", 1);
		map.put("Srinu", 2);
		map.put("Sai", 3);
		map.put("Mahesh", 4);
		map.put("Srinu", 5);
		map.put("Srinibvas", 6);
		map.put("Malakobndaiah", 7);
		map.put("Prathap", 8);
		map.put("Malayadri", 9);
		map.put("Lokesh", 10);
		map.put("Babu", 11);
		map.put("Lakshmman", 12);
		
	Set s=map.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext()){
		Map.Entry ma=(Entry) itr.next();
		System.out.println(ma);
		
	}
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
	}
	//for java 1.8 version
	  map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
	}
	}

