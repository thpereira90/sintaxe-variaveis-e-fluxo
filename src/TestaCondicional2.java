
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando Condicionais 2");
		
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		//boolean acompanhado = true;
		//boolean acompanhado = false;
		
		//if (idade >= 18 || acompanhado) { // Função || = "OU".
		if (idade >= 18 && acompanhado) { // Função && = "E".
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
