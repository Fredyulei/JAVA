package XmlSaxx;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Jiexis {
	@XmlElement(name="jiexi2")
	private List<Jiexi2> jiexi2;
	
	
	public List<Jiexi2> getJiexi2() {
		return jiexi2;
	}

	public void setJiexi2(List<Jiexi2> jiexi2) {
		this.jiexi2 = jiexi2;
	}

}
