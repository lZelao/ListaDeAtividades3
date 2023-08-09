package AtividadeB;

import AtividadeB.Cliente.cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		cliente cliente1 = new cliente("Eliseu", 1231233, 89728937, 2000,"(73)9999999 ", 4);


        cliente1.cadastrarCliente("Marcos", 837248, 8327498, 500, "(73)8888888", 4);
        cliente1.alterarCliente("Marcos", 837248, 8327498, 2, "(73)8888888", 4);
    	
	
        cliente1.mostrarSaldo();
		
		

	}

}
