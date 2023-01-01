package entidades;

public class Empresa extends Contribuinte {
	
	private int numerosDeFuncionarios;
	
	public Empresa () {
		super();
	}	
	
	
	public Empresa(String nome, Double rendaAnual, int numerosDeFuncionarios) {
		super(nome, rendaAnual);
		this.numerosDeFuncionarios = numerosDeFuncionarios;
	}


	public int getNumerosDeFuncionarios() {
		return numerosDeFuncionarios;
	}


	public void setNumerosDeFuncionarios(int numerosDeFuncionarios) {
		this.numerosDeFuncionarios = numerosDeFuncionarios;
	}

	@Override
	public Double imposto() {		
		double valorImposto =0.0;		
		if(this.numerosDeFuncionarios <= 10  ) {
			valorImposto = getRendaAnual() * 0.16; 
			return valorImposto;
		} else if (this.numerosDeFuncionarios > 10) {
			valorImposto = getRendaAnual() * 0.14; 
			return valorImposto;
		}
		return valorImposto; 
	}

	@Override
	public String toString() {
		return "Empresa\n[nome=" + nome + ", rendaAnual=" + String.format("r$ %.2f", rendaAnual) + ", numerosDeFuncionarios="
				+ numerosDeFuncionarios + ", imposto =" + String.format("r$ %.2f",imposto()) + "]";
	}
	
	
		

}
