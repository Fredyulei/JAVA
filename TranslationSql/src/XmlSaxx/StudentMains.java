package XmlSaxx;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class StudentMains {
	public static void main(String[] args) {
		Student student=new Student("qing","male",20);
		
		JAXBContext ctx=null;
		try {
			ctx=ctx.newInstance(student.getClass());
			ctx.createMarshaller().marshal(student, new File("student.xml"));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
