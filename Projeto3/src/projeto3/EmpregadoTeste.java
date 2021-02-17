package projeto3;

import java.text.NumberFormat;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("Fulano", "Siclano", 6500);
		System.out.println("Salario Mensal de " + e1.getNome() + ": " + e1.getExibirSalarioMensal());
		e1.setAumento(10); //10% de aumento
		System.out.println("Salario Mensal de " + e1.getNome() + ": " + e1.getExibirSalarioMensal());
		System.out.println("Salario Anual de " + e1.getNome() + ": " + e1.getExibirSalarioAnual());
				
		Empregado e2 = new Empregado("Siclano", "Furlane", 3498.98);
		Empregado.getNumeroFuncionariosPassaramPelaEmpresa();
		
	}

}
