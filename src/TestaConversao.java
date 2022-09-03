
public class TestaConversao {

	public static void main(String[] args) {

		float pontoFlutuante = 3.14F; // aqui!!
		
		double salario = 1270.50;
		int valor = (int) salario;

		System.out.println(valor);

		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;

		System.out.println (total);

		// Imaginamos que nossa saída seria 0.3, mas obtemos um número completamente
		// diferente, Devido essa inconsistência, double não seria a melhor escolha para
		// guardarmos salário. Existem outras alternativas melhores que veremos em
		// outros cursos.
		
	}
}
