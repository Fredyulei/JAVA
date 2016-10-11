package com.qingke;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class kehu {

	public static void main(String[] args) {
		//Socket s;
		try {
			 Socket s = new Socket("¿Í»§", 3333);

			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String clientMsg;
			String serverMsg;
			Scanner sc = new Scanner(System.in);
			clientMsg = sc.nextLine();
			while (clientMsg.equals("baby")) {
				output.write(clientMsg + "/r/n");
				output.flush();
				serverMsg = input.readLine();
				System.out.println("server says" + serverMsg);
				clientMsg = sc.nextLine();
			}
			sc.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
