package com.qingke;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private static final int port = 3222;

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.println("��ʼ�����з�����....");
			Socket socket= ss.accept();
			System.out.println("vvvvvv");
			System.out.println("��ʼ��"+port+"�����з�����");
			//������
			BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//�����
			BufferedWriter output=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//�ͻ��������Ϣ
			String clientMag;
			//������������Ϣ
			String serverMag;
			//����̨¼��
			Scanner sc=new Scanner(System.in);
			//��ȡ��������������Ϣ
			clientMag=input.readLine();
			
			while (!("bay".equals(clientMag))){
				//��ӡ �����������Ϣ
				System.out.println("�ͻ���˵��"+clientMag+"\r\n");
				//����������һ��д��Ϣ
				serverMag=sc.nextLine();
				//д��Ϣ������
				output.write(serverMag + "\r\n");
				output.flush();
				//��ȡ����������Ϣ
				clientMag=input.readLine();				
			}
			sc.close();
			ss.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}