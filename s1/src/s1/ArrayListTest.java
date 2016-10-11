package s1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//不可以引用基本类型
		ArrayList<Integer>numberList=new ArrayList<Integer>();
		//add 添加  是集合
		numberList.add(10);
		numberList.add(15);
		numberList.add(25);
		//输出
		System.out.println(numberList.get(0));
		//遍历第一种
		for(int i=0;i<numberList.size();i++){
			System.out.println(numberList.get(i));
		}
		//遍历第二种 Integer 整数类型
		for(Integer value:numberList){
			System.out.println(value);
		}
		//遍历3
		System.out.println("bianli");
		//结构：Iterator <> s=a.iterator();
		Iterator<Integer>it=numberList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//移除元素
		numberList.remove(0);
		//numberList.remove(numberList.size()-1);
		System.out.println(numberList.remove(0));
		//List<Integer>list=new ArrayList<Integer>();
	}
}