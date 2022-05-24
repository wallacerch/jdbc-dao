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
		
		System.out.println("===Teste findAll===");
		List<Departamento>lista = depDao.findAll();
		for (Departamento departamento : lista) {
			System.out.println(departamento);
		}
		
		System.out.println("===Teste insert===");
		Departamento newDep = new Departamento(null, "Sports");
		depDao.insert(newDep);
		System.out.println("Departamento inserido! Novo id = " + newDep.getId());
		
		System.out.println("===Teste update===");
		dep = depDao.findById(3);
		dep.setNome("Food");
		depDao.update(dep);
		System.out.println("Atualização completa!");
		
		System.out.println("===Teste deleteById===");
		depDao.deleteById(8);
		System.out.println("Deleção completa!");
	}

}
