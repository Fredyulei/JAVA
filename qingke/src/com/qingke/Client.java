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
			//�ͻ������Ϣ
			String clientMsg;
			//��������Ϣ
			String serverMsg;
			//����̨¼��
			Scanner sc=new Scanner(System.in);
			//��һ��������Ϣ
			clientMsg=sc.nextLine();
			while(!("bye".equals(clientMsg))){
				//�������������Ϣ
				output.write(clientMsg+"\r\n");
				output.flush();
				//��ȡ��һ�С�������������Ϣ
				serverMsg=input.readLine();
				System.out.println("������ says:"+serverMsg+"\r\n");
				//��������һ��������Ϣ
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
