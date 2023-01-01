package entidades;

public class Empresa extends Contribuinte {
	
	private int numerosDeFuncionarios;
	
	public Empresa () {
		super();
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
			valorImposto = this.rendaAnual * 0.16; 
			return valorImposto;
		} else if (this.numerosDeFuncionarios > 10) {
			valorImposto = this.rendaAnual * 0.14; 
			return valorImposto;
		}
		return valorImposto; 
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", rendaAnual=" + rendaAnual + ", numerosDeFuncionarios="
				+ numerosDeFuncionarios + ", imposto =" + String.format("%.2f",imposto()) + "]";
	}
	
	
		

}
