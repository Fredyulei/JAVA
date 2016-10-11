package s1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		HashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		testMap(treeMap);
		System.out.println("-------------------");
		testMap(hashMap);
		System.out.println("-------------------");
		testMap(linkedHashMap);
		

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(2, "Twoa");
		map.put(4, "Awoo");
		map.put(3, "qwe");
		map.put(7, "TwoqA");
		map.put(5, "Twod");
		for(Map.Entry<Integer,String> entry :map.entrySet()){
			System.out.println(entry.getKey() + entry.getValue());
		}

	}
}