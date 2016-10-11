package XmlSaxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Jiexi1 {
	public static void main(String[] args) {
		//在哪个类里使用就创建对象
		Jiexi1 myfileReader = new Jiexi1();
		
		List<Jiexi2> list = myfileReader.readFile("info.txt");
		
		for(Jiexi2 i : list){
		System.out.println(i);
		}
		
//		for(Jiexi2 i : list){
//			System.out.println(i.getId()+i.getBossName());
//		}
		
		//创建一个根节点子对象
		Jiexis jiexis = new Jiexis();
		//在子对象中放入参数
		jiexis.setJiexi2(list);
		
		JAXBContext ctx = null;
		
		try {
			
			//根节点Jiexi
			ctx = ctx.newInstance(Jiexis.class);
			//序列化
			ctx.createMarshaller().marshal(jiexis, new File("info.xml"));
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public List<Jiexi2> readFile(String filename) {
		
		BufferedReader br = null;
		
		List<Jiexi2> results = new ArrayList<Jiexi2>();
		try {
			br = new BufferedReader(new FileReader(filename));

			String line = null;

			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}

				Jiexi2 region = new Jiexi2();
				String[] patterns = line.split(",");

				String id = patterns[0];
				String name = patterns[1];
				String avgIncome = patterns[2];
				String superRegionId = patterns[3];
				String bossName = (patterns.length == 5) ? patterns[4] : "";

				region.setId(id);
				region.setName(name);
				region.setAvgIncome(avgIncome);
				region.setParentId(superRegionId);
				region.setBossName(bossName);

				results.add(region);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return results;
	}
}