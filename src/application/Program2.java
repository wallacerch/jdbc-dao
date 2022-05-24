package application;

import java.util.Date;
import java.util.List;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program2 {

	public static void main(String[] args) {

		DepartamentoDao depDao = FabricaDao.createDepartamentoDao();
		
		System.out.println("===Teste findById===");
		Departamento dep = depDao.findById(1);
		System.out.println(dep);
		
//		System.out.println("===Teste findByDepartamento===");
//		Departamento dep = new Departamento(2, null);
//		List<Vendedor> lista = vendDao.findByDepartamento(dep);
//		for (Vendedor vendedor : lista) {
//			System.out.println(vendedor);
//		}
//		
//		System.out.println("===Teste findAll===");
//		lista = vendDao.findAll();
//		for (Vendedor vendedor : lista) {
//			System.out.println(vendedor);
//		}
//		
//		System.out.println("===Teste insert===");
//		Vendedor newVend = new Vendedor(null, "Greg White", "greg@gmail.com", new Date(), 4000.0, dep);
//		vendDao.insert(newVend);
//		System.out.println("Vendedor inserido! Novo id = " + newVend.getId());
//		
//		System.out.println("===Teste update===");
//		vend = vendDao.findById(1);
//		vend.setNome("Bob Black");
//		vendDao.update(vend);
//		System.out.println("Atualização completa!");
//		
//		System.out.println("===Teste deleteById===");
//		vendDao.deleteById(9);
//		System.out.println("Deleção completa!");
	}

}
