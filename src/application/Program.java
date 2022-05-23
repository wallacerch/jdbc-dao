package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		VendedorDao vendDao = FabricaDao.createVendedorDao();
		
		System.out.println("===TESTE FINDBYID===");
		Vendedor vend = vendDao.findById(3);
		System.out.println(vend);
		
		System.out.println("===TESTE FINDBYDEPARTAMENTO===");
		Departamento dep = new Departamento(2, null);
		List<Vendedor> lista = vendDao.findByDepartamento(dep);
		for (Vendedor vendedor : lista) {
			System.out.println(vendedor);
		}
	}

}
