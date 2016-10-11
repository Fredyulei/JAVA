package s1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//ArrayList 是用 的形式保存对象  这种方式将对象存放在连续的空间里
		//随机访问数据，运行速度慢,插入慢。他是一个数组如果从头加一个数据，那么
		//下面的数据位置都会改变，就很慢。,如果从尾部插就很快，比如排队中的插队和正常排队
		//[0]
		//[1]
		//[2]
		//[3]
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		//linkedList  将对象存放在独立的内存空间，存放下一个对象和上一个对象的索引
		//插入的更快，运行速度快。从头插就是把头部的数据互换一下，需要的时间很快
		//如果从尾部的话需要遍历后面的元素，得到尾部，然后替换，遍历需要花很多时间，
		//所以时间很慢（因为lingkedlist只提供了索引，需要遍历到最后一个元素，时间
		//就变长了）
		//[0]->[1]->[2]......
		List <Integer>linkedList=new LinkedList<Integer>();
		//计算时间
		doTiming("ArrayList",arrayList);
		doTiming("LinkedList",linkedList);
		
	}
	private static void doTiming(String type,List<Integer>List){
//		for(int i=0;i<122222;i++){
//			List.add(i);
//		}
		long start=System.currentTimeMillis();
		for(int i=0;i<122222;i++){
			List.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(type+"："+(end -start)+ "毫秒");
	}
}