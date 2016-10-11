package s1;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		//输入.put  .get输出   get(a)获取键值等于a的value值
		hashMap.put(4,"Four");
		hashMap.put(1,"One");
		hashMap.put(5,"Five");
		hashMap.put(7,"Seven");
		//不能重复定义一个变量，否则会被覆盖也就是重新赋值。
		
		hashMap.put(7,"qi");
		//System.out.println(hashMap.toString());
		//String text=hashMap.get(7);
		//System.out.println(text);
		
		for(Map.Entry<Integer,String> entry :hashMap.entrySet()){
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
		Iterator it=hashMap.entrySet().iterator();
		
		while(it.hasNext()){
		//Map.Entry<Integer, String> entry=(Entry<Integer,String> it.next());
			//int key=entry.getKey();
			//String value;
			System.out.println(it.next());
		}
	}



}
