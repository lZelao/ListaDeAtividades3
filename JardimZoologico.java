package atividadeC;

import atividadeC.Animal.animal;

public class JardimZoologico {

	public static void main(String[] args) {
		animal animal1 = new animal("null","null","null",0,"null");
		 animal1.cadastrarAnimal("Cavalo", "10/10/2002", "FreeWille", 231, "California");
		 animal1.alterarAnimal("Cavalo", "10/10/2002", "FreeWille", 51, "Austria");
		 
		 animal1.listarCaracteristicas();
		
		
		

	}

}
