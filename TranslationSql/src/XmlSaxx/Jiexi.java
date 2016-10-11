package XmlSaxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Jiexi {
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "provice")
	private String province;
	@XmlElement(name = "income")
	private int income;
	@XmlElement(name = "region")
	private int  region;
	@XmlElement(name = "name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Jiexi [id=" + id + ", province=" + province + ", income=" + income + ", region=" + region + ", name="
				+ name + "]";
	}
	
	
	
}
