package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoExample3 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter empid");
			int empid = Integer.parseInt(br.readLine());

			System.out.println("Enter empName");
			String empName = br.readLine();

			System.out.println("Enter empSalary");
			Double empSalary = Double.parseDouble(br.readLine());

			System.out.println("emp_id->" + empid);
			System.out.println("empName->" + empName);
			System.out.println("empSalary->" + empSalary);

			BufferedWriter bw = null;

			try {
				bw = new BufferedWriter(new FileWriter(new File("sample.txt"),true));
				bw.write("\nEmpId: " + empid);
				bw.write("\nEmpName: " + empName);
				bw.write("\nEmpSalary: " + empSalary);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				bw.close();
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
