package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;

public class ArakoMenu {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"));
			PrintStream os = System.out){
			String data;
			
			while((data = br.readLine())!= null){
				writer.write(data + "\n");
				writer.flush();
			}
			System.out.println("<<�޴� ���>>");
			while ((data = reader.readLine())!= null){
				System.out.println(data);
			}
			
				
				
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
