package projeto3;

public class Empregado {
	
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	private static int numeroDeEmpregados;
	
	public Empregado(String nome, String sobreNome, double salarioMensal) {
		this.setNome(nome);
		this.setSobreNome(sobreNome);
		this.setSalarioMensal(salarioMensal);
		this.numeroDeEmpregados+=1;
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

	public void getNumeroFuncionariosPassaramPelaEmpresa() {
		System.out.println("Passaram: "+this.numeroDeEmpregados+" empregados pela empresa!");
	}
}
