package atividadeA;

public  class Carro {

	private int codigo;
	private String marca;
	private String cor;
	private String modelo;
	private int ano;
	private int numeroDeportas;
	private String tipoDecombustivel;
	private int QtdDisponivel;
	private float preco;
	private String completoOubasico;

	public Carro(int codigo, String marca, String cor, String modelo, int ano, int numeroDeportas,
			String tipoDecombustivel, int QtdDisponivel, float preco, String completoOubasico) {

		this.codigo = codigo;
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.setAno(ano);
		this.setNumeroDeportas(numeroDeportas);
		this.setTipoDecombustivel(tipoDecombustivel);
		this.setQtdDisponivel(QtdDisponivel);
		this.setPreco(preco);
		this.setCompletoOubasico(completoOubasico);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumeroDeportas() {
		return numeroDeportas;
	}

	public void setNumeroDeportas(int numeroDeportas) {
		this.numeroDeportas = numeroDeportas;
	}

	public int getQtdDisponivel() {
		return QtdDisponivel;
	}

	public void setQtdDisponivel(int qtdDisponivel) {
		QtdDisponivel = qtdDisponivel;
	}

	public String getTipoDecombustivel() {
		return tipoDecombustivel;
	}

	public void setTipoDecombustivel(String tipoDecombustivel) {
		this.tipoDecombustivel = tipoDecombustivel;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCompletoOubasico() {
		return completoOubasico;
	}

	public void setCompletoOubasico(String completoOubasico) {
		this.completoOubasico = completoOubasico;
	}

	public void cadastrarCarro(int codigo, String marca, String cor, String modelo, int ano, int numeroDePortas,
			String tipoDeCombustivel, int qtdDisponivel, float preco, String completoOuBasico) {
		this.codigo = codigo;
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.numeroDeportas = numeroDePortas;
		this.tipoDecombustivel = tipoDeCombustivel;
		this.QtdDisponivel = qtdDisponivel;
		this.preco = preco;
		this.completoOubasico = completoOuBasico;
	}

	public void alterarCarro(int codigo, String marca, String cor, String modelo, int ano, int numeroDePortas,
			String tipoDeCombustivel, int qtdDisponivel, float preco, String completoOuBasico) {
		this.codigo = codigo;
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.numeroDeportas = numeroDePortas;
		this.tipoDecombustivel = tipoDeCombustivel;
		this.QtdDisponivel = qtdDisponivel;
		this.preco = preco;
		this.completoOubasico = completoOuBasico;
	}

//Método para listar informações do carro
	public void listarCarro() {
		System.out.println("Código: " + codigo);
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Número de Portas: " + numeroDeportas);
		System.out.println("Tipo de Combustível: " + tipoDecombustivel);
		System.out.println("Quantidade Disponível: " + QtdDisponivel);
		System.out.println("Preço: " + preco);
		System.out.println("Completo ou Básico: " + completoOubasico);
	}
}
