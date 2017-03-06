package com.hand.syb.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MyCollect {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Map<Integer,List> map = new HashMap<Integer,List>();
		
		for(int i =0;i<50;i++){
			int x = (int)(Math.random()*100);
			list.add(x);
		}
		
		System.out.print("随机生成的50个小于100的数字分别为： ");
		for (int i = 0; i < list.size(); i++) {
			if(i==list.size()-1)  System.out.print(list.get(i));
			else   System.out.print(list.get(i)+",");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			
			List<Integer> list2 = new ArrayList<Integer>();
			
			for (int j = 0; j < list.size(); j++) {
				if(list.get(j)/10 == i){
					list2.add(list.get(j));
				}
			}
			map.put(i, list2);
			list.removeAll(list2);
		}
		
		System.out.print("Map 中的数据为: {");
		for (Entry<Integer, List> entry : map.entrySet()) {  
			if(entry.getKey() == 10)  System.out.print(entry.getKey() + "=> " + entry.getValue());  
			else System.out.print(entry.getKey() + "=> " + entry.getValue()+",");  
		}  
		System.out.print("}");
		
		for (Entry<Integer, List> entry : map.entrySet()) {  
			mapSort(entry.getValue());
		} 
		
	
		System.out.println();
		System.out.print("排序后的 Map 为: {");
		for (Entry<Integer, List> entry : map.entrySet()) {  
			if(entry.getKey() == 10)  System.out.print(entry.getKey() + "=> " + entry.getValue());  
			else System.out.print(entry.getKey() + "=> " + entry.getValue()+",");  
		}  
		System.out.print("}");

	}

	public static void mapSort(List list) {
		list.sort(null);
	}

}
