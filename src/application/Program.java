package application;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		VendedorDao vendDao = FabricaDao.createVendedorDao();
		
		Vendedor vend = vendDao.findById(7);

		System.out.println(vend);

	}

}
