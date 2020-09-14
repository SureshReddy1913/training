package com.training.io;

import java.io.File;

public class IOExample2 {

	public static void main(String[] args) {
		File file = new File("sample");
		System.out.println("is directory "+file.isDirectory());
		
		String [] files= file.list();
		
		for(String file_temp:files) {
			System.out.println(file_temp);
		}
		
		for(File f:file.listFiles()) {
			if(f.isFile()) {
				System.out.println(f.getName()	);
			}
		}
	}
}
