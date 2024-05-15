package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1,"Books");
		System.out.println(dp);
		Seller sl = new Seller(21,"bob","B@gmail",new Date(), 3000.0, dp);
		System.out.println(sl);
		
	}

}
