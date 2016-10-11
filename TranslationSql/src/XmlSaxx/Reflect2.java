package XmlSaxx;

import java.io.File;
import java.lang.reflect.Field;

public class Reflect2 {

	public static void reflect(Object object){
		//Class classType=object.getclass();
		//Class
		Class classType=object.getClass();
		Field[] fields=classType.getDeclaredFields();
		Field[] allfields=classType.getFields();
		
		for(Field f:fields){
			f.setAccessible(true);
			
			try {
				System.out.println(f.getName());
				System.out.println(f.getName()+":"+f.get(object));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
