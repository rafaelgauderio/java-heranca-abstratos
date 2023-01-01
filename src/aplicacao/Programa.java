package aplicacao;

import java.util.Locale;

import entidades.Contribuinte;
import entidades.Empresa;
import entidades.Individual;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		
		//Contribuinte cont1 = new Contribuinte (); Não pode ser instanciada uma classe Abstrata
		
		Individual ind1 = new Individual();
		ind1.setNome("Rafael de Luca");
		ind1.setRendaAnual(50000.0);
		ind1.setDespesasMedicas(2000.0);
		
		Contribuinte ind2 = new Individual("Claudia Silva",200000.0);
		
		
		Empresa emp1 = new Empresa("Química Omega",400000.0,25);
		Empresa emp2 = new Empresa("Química Omega filial",400000.0,10);
		
		System.out.println("\nDados dos Contribuintes");
		System.out.println(ind1);
		System.out.println(ind2);
		System.out.println(emp1);
		System.out.println(emp2);
		
		

	}

}
