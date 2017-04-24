package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CuncurrentHashMap {

	public static void main(String[] args) {
		Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<String, String>());

		syncMap.put("1", "ALIVE ");
		syncMap.put("2", "IS");
		syncMap.put(null, "AWESOME");

		System.out.println("Synchronized map :" + syncMap);
		
		final ArrayList<String> list=new ArrayList<>();
		
	}

}
