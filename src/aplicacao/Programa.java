package aplicacao;

import java.util.ArrayList;
import java.util.List;
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
		
		
		System.out.println("\nArmazenando dados em uma lista de Contribuintes");
		
		// Lista de coleções sempre da classe genérica (superClasse)
		List<Contribuinte> listaContribuintes = new ArrayList<Contribuinte>(); 
		
		Contribuinte alex = new Individual("Alex",50000.0,2000.0);
		Contribuinte softTech = new Empresa("SoftTech",400000.0,25);
		Contribuinte bob = new Individual("Bob",120000.0,1000.0);
		
		listaContribuintes.add(alex);
		listaContribuintes.add(softTech);
		listaContribuintes.add(bob);
		
		Double somatorio =0.0;
		System.out.println("Pagantes de Imposto");
		for(Contribuinte apelido: listaContribuintes) {
			somatorio = somatorio + apelido.imposto();
			System.out.println(apelido.getNome() + ": R$ " + String.format("%.2f",apelido.imposto()));
		}
		
		System.out.print("\n");
		System.out.printf("Total de Impostos: %s",String.format("R$ %.2f",somatorio));
		
		
		

	}

}
