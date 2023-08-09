package atividadeE;
import atividadeE.Empresa;

public class EmpresaXPTO {

	public static void main(String[] args) {
		 Empresa funcionario = new Empresa("null","null","null","null","null","null",0,"null","null",0);
		 funcionario.cadastrarFuncionario("João da Silva", "1990-05-15", "123456789", "987654321",
				 "Rua das Flores, 123", "São Paulo", 5000.0f, "Engenheiro", "Bacharelado", 1001);
         funcionario.listandoInformacoes();
         
         System.out.println("--------------alteração de dados--------------");
         
         funcionario.AlterarFuncinario("Cleber", "1990-05-15", "123456789", "987654321",
				 "Rua das Flores, 123", "São Paulo", 5000.0f, "Engenheiro", "Bacharelado", 1005);
         funcionario.listandoInformacoes();
         
	}

}
