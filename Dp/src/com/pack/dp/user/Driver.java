package com.pack.dp.user;

import java.util.Scanner;
import java.sql.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u = new User();
		System.out.println("Enter Your Details: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.next();

		System.out.println("Date Of Birth('yyyy-MM-dd'): ");
		String dob = sc.next();

		try {

			Date dateOfBirth = Date.valueOf(dob);

			u.setDob(dateOfBirth);
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Address: ");
		String addr = sc.next();

		System.out.println("Phone number: ");
		String phNo = sc.next();

		u.setName(name);
		u.setAddress(addr);
		u.setPhNo(phNo);

		
		UserDAO dao = new UserDAO();
		try {
			dao.storeUser(u);
			System.out.println("Information Stored Successfully! ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
