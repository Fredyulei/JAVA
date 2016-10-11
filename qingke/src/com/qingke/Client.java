package com.qingke;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost",3222);
			
			BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter output=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			//客户打的信息
			String clientMsg;
			//发出的信息
			String serverMsg;
			//控制台录入
			Scanner sc=new Scanner(System.in);
			//下一行输入信息
			clientMsg=sc.nextLine();
			while(!("bye".equals(clientMsg))){
				//“输出流”的信息
				output.write(clientMsg+"\r\n");
				output.flush();
				//读取下一行“输入流”的信息
				serverMsg=input.readLine();
				System.out.println("服务器 says:"+serverMsg+"\r\n");
				//继续在下一行输入信息
				clientMsg=sc.nextLine();
			}
			sc.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
