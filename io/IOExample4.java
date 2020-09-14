package com.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOExample4 {

	public static void main(String[] args) {
		try {
			File file= new File("sample.txt");
			
			BufferedReader br= new BufferedReader(new FileReader(file));
			
			String temp="";
			
			while((temp=br.readLine())!=null) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
