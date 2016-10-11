package com.qingke.operator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FuctionOperator {
	public static void main(String[] args) {
		while (true) {
			Scanner sr = new Scanner(System.in);
			System.out.println("请输入运算公式:");
			String a = sr.nextLine();
			Pattern pattern = Pattern.compile("^(-?\\d+(?:\\.\\d+)?)([/+-/*//])(\\d+(?:\\.\\d+)?)$");
			Matcher m = pattern.matcher(a);
			while (m.find()) {
				String s1 = m.group(1);
				String s2 = m.group(2);
				String s3 = m.group(3);
				System.out.println("s1=" + s1 + " s2:" + s2 + " s3=" + s3);
				Operator q = new OperatorFactory().buildOperator(s2);
				double c1 = Double.parseDouble(s1);
				double c2 = Double.parseDouble(s3);
				double result;
				try {
					result = q.dooperator(c1, c2);
					System.out.println("result:" + result);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("是否继续查询 ：继续 yes——退出no");
				String i = sr.nextLine();
				while (true) {
					if (!(("yes".equals(i)) || ("no".equals(i)))) {
						System.out.println("请输入正确命令");
						i = sr.nextLine();
					}
					break;
				}
				if (i.equals("yes")) {
					continue;
				}
				if (i.equals("no")) {
					System.out.println("已经退出查询");
				}
			}
			break;
		}

	}

}