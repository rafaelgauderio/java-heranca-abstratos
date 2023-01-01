package entidades;

public class Individual extends Contribuinte {
	
	private Double despesasMedicas=0.0;

	public Individual () {
		super();
	}
	
	public Individual (String nome, Double rendaAnual) {
		super(nome, rendaAnual);		
	}
	
	public Individual (String nome, Double rendaAnual, Double despesasMedicas) {
		super(nome, rendaAnual);
		this.despesasMedicas = despesasMedicas;
	}	
	
	
	public Double getDespesasMedicas() {
		return despesasMedicas;
	}

	public void setDespesasMedicas(Double despesasMedicas) {
		this.despesasMedicas = despesasMedicas;
	}
	
	@Override
	public Double imposto() {
		double valorImposto =0.0;		
		if(this.rendaAnual < 20000.0 ) {
			valorImposto = this.rendaAnual * 0.15 - (this.despesasMedicas * 0.5);
			return valorImposto;
		} else if (this.rendaAnual >= 20000) {
			valorImposto = this.rendaAnual * 0.25 - (this.despesasMedicas * 0.5);
			return valorImposto;
		}
		return valorImposto; 
		
	}

	@Override
	public String toString() {
		return "Individual\n[nome=" + nome + ", rendaAnual=" + String.format("r$ %.2f",rendaAnual) + ", despesasMedicas=" + String.format("r$ %.2f",despesasMedicas)
				+ ", imposto=" + String.format("r$ %.2f",imposto()) + "]";
	}

	
	

}
