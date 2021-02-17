package projeto3;

public class Empregado {
	
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	
	public Empregado(String nome, String sobreNome, double salarioMensal) {
		super();
		this.setNome(nome);
		this.setSobreNome(sobreNome);
		this.setSalarioMensal(salarioMensal);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
