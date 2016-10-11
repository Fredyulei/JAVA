package XmlSaxx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)

public class Jiexi2 {
	@XmlAttribute(name = "id")
	private String id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "avgIncome")
	private String avgIncome;
	@XmlElement(name = "parentId")
	private String parentId;
	@XmlElement(name = "bossName")
	private String bossName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvgIncome() {
		return avgIncome;
	}
	public void setAvgIncome(String avgIncome) {
		this.avgIncome = avgIncome;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getBossName() {
		return bossName;
	}
	public void setBossName(String bossName) {
		this.bossName = bossName;
	}
	@Override
	public String toString() {
		return "Jiexi2 [id=" + id + ", name=" + name + ", avgIncome=" + avgIncome + ", parentId=" + parentId
				+ ", bossName=" + bossName + "]";
	}

	
}