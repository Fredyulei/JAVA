package XmlSaxx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
public static void main(String[] args) {
		
		Student student=new Student("qingke","MALE",20);
		try {
			//输出流
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Student2.output"));
		    oos.writeObject(student);
			oos.close();
			//输入流
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student2.output"));
			Object object=ois.readObject();
			System.out.println("old students"+student);
			System.out.println("new students"+object);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

