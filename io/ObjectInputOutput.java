package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput {

	public static void writeObject(Employee emp) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("emps.txt")); // mention true to append
			oos.writeObject(emp);
			oos.writeInt(123);

			System.out.println("data written....");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static void readObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emps.ser"));
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);
		int number = ois.readInt();
		System.out.println(number);
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Employee employee = new Employee(101, "ghags", 12345);
		//writeObject(employee);
		readObjects();
	}
}
