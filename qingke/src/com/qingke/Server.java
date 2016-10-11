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
			System.out.println("开始在运行服务器....");
			Socket socket= ss.accept();
			System.out.println("vvvvvv");
			System.out.println("开始在"+port+"上运行服务器");
			//输入流
			BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//输出流
			BufferedWriter output=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//客户输入的信息
			String clientMag;
			//服务器发出信息
			String serverMag;
			//控制台录入
			Scanner sc=new Scanner(System.in);
			//读取“输入流”的信息
			clientMag=input.readLine();
			
			while (!("bay".equals(clientMag))){
				//打印 “输出流”信息
				System.out.println("客户端说了"+clientMag+"\r\n");
				//服务器在下一行写信息
				serverMag=sc.nextLine();
				//写信息并发出
				output.write(serverMag + "\r\n");
				output.flush();
				//读取输入流的信息
				clientMag=input.readLine();				
			}
			sc.close();
			ss.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}