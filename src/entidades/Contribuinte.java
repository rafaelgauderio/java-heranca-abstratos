package entidades;

public abstract class Contribuinte {

	protected String nome;
	protected Double rendaAnual = 0.0;

	public Contribuinte() {

	}

	public Contribuinte(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		if (rendaAnual > 0.0) {
			this.rendaAnual = rendaAnual;
		}

	}

	public abstract Double imposto();

}
