package atividadeC;
public class Animal {
	public static class animal {

		private String especie;
		private String dataN;
		private String nome;
		private int numeroDregistro;
		private String localDeNascimento;
		
	

		public animal(String especie, String dataN, String nome, int numeroDregistro,String localDeNascimento) {

			this.especie = especie;
			this.setDataN(dataN);
			this.setNome(nome);
			this.setNumeroDregistro(numeroDregistro);
			this.setLocalDeNascimento(localDeNascimento);
			
		}

		

		public void cadastrarAnimal(String especie, String dataN, String nome, int numeroDregistro,String localDeNascimento) {
			this.especie = especie;
			this.setDataN(dataN);
			this.setNome(nome);
			this.setNumeroDregistro(numeroDregistro);
			this.setLocalDeNascimento(localDeNascimento);
			
		}

		public void alterarAnimal(String especie, String dataN, String nome, int numeroDregistro,String localDeNascimento) {
			this.especie = especie;
			this.setDataN(dataN);
			this.setNome(nome);
			this.setNumeroDregistro(numeroDregistro);
			this.setLocalDeNascimento(localDeNascimento);
			
		}

// Método para listar caracteristicas do animal
		public void listarCaracteristicas() {
			
			System.out.println("A especie do animal é:" + especie);
			System.out.println("A data de nascimento dele é:" + dataN);
			System.out.println("O nome do animal é:" + nome);
			System.out.println("O numero de registro é:" + numeroDregistro);
			System.out.println("A especie do animal é:" + localDeNascimento);
			
			
			
		}



		public String getEspecie() {
			return especie;
		}



		public void setEspecie(String especie) {
			this.especie = especie;
		}



		public String getDataN() {
			return dataN;
		}



		public void setDataN(String dataN) {
			this.dataN = dataN;
		}



		public String getNome() {
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public int getNumeroDregistro() {
			return numeroDregistro;
		}



		public void setNumeroDregistro(int numeroDregistro) {
			this.numeroDregistro = numeroDregistro;
		}



		public String getLocalDeNascimento() {
			return localDeNascimento;
		}



		public void setLocalDeNascimento(String localDeNascimento) {
			this.localDeNascimento = localDeNascimento;
		}
	}
	

}
