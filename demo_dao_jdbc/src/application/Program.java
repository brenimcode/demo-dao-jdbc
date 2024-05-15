package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
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
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		list = sl.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TESTE 4: seller Insert ===");
		Department dep = new Department(2,null);
		Seller newSeller = new Seller(null, "Greg", "Greg@docris.com", new Date(), 4000.0, dep);
		sl.insert(newSeller);
		System.out.println(newSeller.getId());
		System.out.println("\n=== TESTE 5: seller Update ===");
		seller = sl.findById(1);
		seller.setName("Leleu");
		sl.update(seller);
		System.out.println("Update success");
		
	}

}
