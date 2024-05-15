package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sl =  DaoFactory.createSellerDao();
		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sl.findById(3);
		
		System.out.println(seller);
		System.out.println("\n=== TESTE 2: seller findByDepartment ===");
		List<Seller> list = sl.findByDepartment(seller.getDepartment());
		
		for(Seller s : list) {
			System.out.println(s);
		}
	}

}
