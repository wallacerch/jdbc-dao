package application;

import java.util.Date;
import java.util.List;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		VendedorDao vendDao = FabricaDao.createVendedorDao();
		
		System.out.println("===Teste findById===");
		Vendedor vend = vendDao.findById(3);
		System.out.println(vend);
		
		System.out.println("===Teste findByDepartamento===");
		Departamento dep = new Departamento(2, null);
		List<Vendedor> lista = vendDao.findByDepartamento(dep);
		for (Vendedor vendedor : lista) {
			System.out.println(vendedor);
		}
		
		System.out.println("===Teste findAll===");
		lista = vendDao.findAll();
		for (Vendedor vendedor : lista) {
			System.out.println(vendedor);
		}
		
		System.out.println("===Teste findById===");
		Vendedor newVend = new Vendedor(null, "Greg White", "greg@gmail.com", new Date(), 4000.0, dep);
		vendDao.insert(newVend);
		System.out.println("Vendedor inserido! Novo id = " + newVend.getId());
		
		System.out.println("===Teste update===");
		vend = vendDao.findById(1);
		vend.setNome("Bob Black");
		vendDao.update(vend);
		System.out.println("Atualização completa!");
	}

}
