package AtividadeB;


	public class Cliente {

		public static class cliente {

	
			private String nome;
			private int rg;
			private int cpf;
			private float saldo;
			private String numero;
			private int agencia;
			



			public String getNome() {
				return nome;
			}



			public void setNome(String nome) {
				this.nome = nome;
			}



			public int getRg() {
				return rg;
			}



			public void setRg(int rg) {
				this.rg = rg;
			}



			public int getCpf() {
				return cpf;
			}



			public void setCpf(int cpf) {
				this.cpf = cpf;
			}



			public String getNumero() {
				return numero;
			}



			public void setNumero(String numero) {
				this.numero = numero;
			}



			public float getSaldo() {
				return saldo;
			}



			public void setSaldo(float saldo) {
				this.saldo = saldo;
			}



			public int getAgencia() {
				return agencia;
			}



			public void setAgencia(int agencia) {
				this.agencia = agencia;
			}
			
			
			
			public cliente(String nome,int rg, int cpf, float saldo, String numero,
					 int agencia) {
				
				this.nome = nome;
				this.rg = rg;
				this.cpf =cpf;
				this.saldo = saldo;
				this.numero = numero;
			
			}

			public void cadastrarCliente(String nome,int rg, int cpf, float saldo, String numero,
					 int agencia) {
				this.nome = nome;
				this.rg = rg;
				this.cpf =cpf;
				this.saldo = saldo;
				this.numero = numero;
			}

			public void alterarCliente(String nome,int rg, int cpf, float saldo, String numero,
					 int agencia) {
				this.nome = nome;
				this.rg = rg;
				this.cpf =cpf;
				this.saldo = saldo;
				this.numero = numero;
				
			}
			 public void mostrarSaldo() {
				 System.out.println("Saldo do Cliente;"+ saldo);
			 }
			
		}

		
	}


