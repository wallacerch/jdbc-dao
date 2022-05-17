package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Departamento dp = new Departamento(1, "Books");
		Vendedor vend = new Vendedor(2, "Maria", "maria@gmail.com", new Date(), 5000.0, dp);

		System.out.println(vend);

	}

}
