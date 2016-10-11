package XmlSaxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "studen")
@XmlAccessorType(XmlAccessType.FIELD)

public class Student {
	public Student() {
		super();
	}

	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "gender")
	private String gender;
	@XmlElement(name = "age")
	private int age;

	// @XmlAttribute? Ù–‘
	public Student(String name, String gender, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.gender = gender;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//@Override
//	public String toString() {
//		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + "]";
//	}

}
