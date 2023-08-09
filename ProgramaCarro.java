package atividadeA;

import atividadeA.Carro;


public class ProgramaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro(0, "null", "null", "null", 0, 0, "null", 0, 0, "null");
		
		carro1.cadastrarCarro(1,"Honda", "Branco", "Civic", 2022, 4, "Etanol", 10, 95000.0f, "Completo");

		carro1.listarCarro();

		System.out.println("------------------DADOS ALTERADOS------------------------");
		carro1.alterarCarro(2,"Toyota", "prata", "xls", 2023, 4, "Etanol", 90, 150000.0f, "Completo");

		carro1.listarCarro();
		System.out.println("------------------------------------------");




	
		
	}

}
