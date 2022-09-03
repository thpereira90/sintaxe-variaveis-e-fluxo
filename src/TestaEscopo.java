
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("testando Escopo");
		
		int idade = 17;
		int quantidadePessoas = 1;
		//boolean acompanhado = quantidadePessoas >= 2;
		//boolean acompanhado = true;
		//boolean acompanhado = false;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) { // Função || = "OU".
		//if (idade >= 18 && acompanhado) { // Função && = "E".
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
