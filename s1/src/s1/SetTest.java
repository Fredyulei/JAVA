package s1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet不记录顺序的
		Set <String> set1=new HashSet<String>();
		
		//linkedHashSet记录添加元素的顺序
		//Set <String> set1=new LinkedHashSet<String>();
		
		//TreeSet 按照原自然顺序 就是abcde字母顺序		
		//Set <String> set1=new TreeSet<String>();
		set1.add("dog");
		set1.add("Dog1");
		set1.add("dog2");
		set1.add("dog3");
		set1.add("dog4");
		set1.add("dog5");
		set1.add("e");
		set1.add("c");
		//遍历
		System.out.println(set1);
		//遍历
		for(String element: set1){
			System.out.println(element);
		}
		//判断是否包含某个元素
		if(set1.contains("dog6")){
			System.out.println("haha");
		}
		if(set1.contains("dog3")){
			System.out.println("haasd");
		}
		//求交集
		Set <String> set2=new TreeSet<String>();
		set2.add("dog1");
		set2.add("dog3");
		set2.add("dog4");
		set2.add("dog5");
		set2.add("dog7");
		set2.add("dog9");
		Set <String> intersection=new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println("交集是"+intersection);
		//存在set不存在于set2中元素
		Set <String> difference=new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println("不同的是"+difference);
	}

}
