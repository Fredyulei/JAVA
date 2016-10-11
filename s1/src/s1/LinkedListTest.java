package s1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//ArrayList ���� ����ʽ�������  ���ַ�ʽ���������������Ŀռ���
		//����������ݣ������ٶ���,������������һ�����������ͷ��һ�����ݣ���ô
		//���������λ�ö���ı䣬�ͺ�����,�����β����ͺܿ죬�����Ŷ��еĲ�Ӻ������Ŷ�
		//[0]
		//[1]
		//[2]
		//[3]
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		//linkedList  ���������ڶ������ڴ�ռ䣬�����һ���������һ�����������
		//����ĸ��죬�����ٶȿ졣��ͷ����ǰ�ͷ�������ݻ���һ�£���Ҫ��ʱ��ܿ�
		//�����β���Ļ���Ҫ���������Ԫ�أ��õ�β����Ȼ���滻��������Ҫ���ܶ�ʱ�䣬
		//����ʱ���������Ϊlingkedlistֻ�ṩ����������Ҫ���������һ��Ԫ�أ�ʱ��
		//�ͱ䳤�ˣ�
		//[0]->[1]->[2]......
		List <Integer>linkedList=new LinkedList<Integer>();
		//����ʱ��
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
		System.out.println(type+"��"+(end -start)+ "����");
	}
}