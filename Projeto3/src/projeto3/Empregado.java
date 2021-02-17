package projeto3;

import java.text.DecimalFormat;

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
	
	private void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public String getExibirSalarioMensal() {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		return ("R$ " + df.format(this.getSalarioMensal()));
	}
	
	public double getSalarioAnual() {
		return (this.salarioMensal * 12);
	}
	
	public String getExibirSalarioAnual() {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		return  ("R$ " + df.format(this.getSalarioAnual()));
	}
	
	public void setAumento(double percentual) {
		
		Double aumento = this.getSalarioMensal() * (1+(percentual/100));
		aumento = (double) Math.round(aumento);
		this.setSalarioMensal(aumento);
		
	}

	public static void getNumeroFuncionariosPassaramPelaEmpresa() {
		System.out.println("Passaram: "+Empregado.numeroDeEmpregados+" empregados pela empresa!");
	}
}
