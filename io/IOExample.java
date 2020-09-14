package com.training.io;

import java.io.File;
import java.io.IOException;

public class IOExample {

	public static void main(String[] args) throws IOException {
		
		File file=new File("sample.txt");
		
		if(file.exists()) System.out.println("file exists");
		else
		{
			System.out.println("file not found");
			file.createNewFile();
		}
		
		System.out.println("file absolute path is "+file.getAbsolutePath());
		System.out.println("last modified: "+file.lastModified());
		System.out.println("isFile: "+file.isFile());
		System.out.println("isRead: "+file.canRead());
		System.out.println(("csn execute: ")+file.canExecute());
	}

}
