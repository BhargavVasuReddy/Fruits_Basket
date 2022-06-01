package myproject1;

import java.sql.SQLException;
import java.util.Scanner;

public class Mainprogram {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		String loop = "y";
		while(loop.equals("y")) {
			
		System.out.println("1. Regisster");
		System.out.println("2. Login");
		System.out.println("\n Enter your choice: \n");
		
		StoreItem si=new StoreItem();
		int a = sc.nextInt();
		switch(a) {
		case 1:
			si.registerUser();
			//System.out.println("register");
			break;
		case 2:
			si.login();
			//System.out.println("Login");
			break;
		default:
				System.out.println("Enter valid choice");
		}
		System.out.println("Do you want to continue : y/n");
		loop= sc.next();
	
		}
	}

}
