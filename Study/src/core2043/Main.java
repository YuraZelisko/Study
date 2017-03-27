package core2043;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import commodity.Auto;

public class Main {
	public static void main(String[] args) {
		
		Map <Person, List<Auto>> map = new HashMap<>();
		
		List <Auto> list1 = new ArrayList<>();
		list1.add(new Auto("mazda", 2));
		list1.add(new Auto("Lada", 4));
		
		List <Auto> list2 = new ArrayList<>();
		list2.add(new Auto("oka", 8));
		list2.add(new Auto("smart", 1));
		
		map.put(new Person("igor", 22),list1);
		map.put(new Person("ira", 22),list2);
		
		
		Set<Entry<Person, List<Auto>>> set = map.entrySet();
		int x = 0;
		int y = 0;
		int z = 0;
		String value = "";
		for (Entry<Person, List<Auto>> entry : set){
			
			
			if(entry.getValue().iterator().next().getYear()>x){
				x = entry.getValue().iterator().next().getYear();
				value = entry.getValue().iterator().next().getBrend();
			}
		}System.out.println(value+" "+x);
		
		for (List <Auto> list : map.values()) {
			for (Auto auto : list) {
				if(auto.getYear()>x)
				x= auto.getYear();
				value = auto.getBrend();
				
			}
		}System.out.println(value + " "+x);
		
		for (Entry<Person, List<Auto>> entry : set) {
			if(list1.iterator().next().getYear()>x){
				x=list1.iterator().next().getYear();
				if(list1.iterator().next().getYear()<y){
					y = list1.iterator().next().getYear();
					z=x+y;

				}
			}
		}
		
//		Map <Integer, String> map = new HashMap<>();
//		map.put(10, "ten");
//		map.put(20, "twenty"); вивести імя людини в якій сукупний вік авто найбільший
//		map.put(30, "thirty");
//		map.put(40, "fourty");
//		
//		System.out.println(map);
//		
//		Set <Entry<Integer, String>> set = map.entrySet();
//		int x = 0;
//		String value = "";
//		for (Entry<Integer, String> entry : set) {
//			
//			if(x<entry.getKey()){
//				x= entry.getKey();
//				value =entry.getValue();
//			}
//			
//		}System.out.println(x+" "+value);
	}
}
