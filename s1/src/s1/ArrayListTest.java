package s1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//���������û�������
		ArrayList<Integer>numberList=new ArrayList<Integer>();
		//add ���  �Ǽ���
		numberList.add(10);
		numberList.add(15);
		numberList.add(25);
		//���
		System.out.println(numberList.get(0));
		//������һ��
		for(int i=0;i<numberList.size();i++){
			System.out.println(numberList.get(i));
		}
		//�����ڶ��� Integer ��������
		for(Integer value:numberList){
			System.out.println(value);
		}
		//����3
		System.out.println("bianli");
		//�ṹ��Iterator <> s=a.iterator();
		Iterator<Integer>it=numberList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//�Ƴ�Ԫ��
		numberList.remove(0);
		//numberList.remove(numberList.size()-1);
		System.out.println(numberList.remove(0));
		//List<Integer>list=new ArrayList<Integer>();
	}
}