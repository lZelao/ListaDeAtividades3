package AtividadeD;

public class Professor {
	private String nome;
	private String titulacao;
	private String formacao;
	private int cargaHoraria;
	private float salario;
	private String descricaoDisciplina;

	public Professor(String nome, String titulacao, String formacao, int cargaHoraria, float salario,
			String descricaoDisciplina) {

		this.setNome(nome);
		this.setTitulacao(titulacao);
		this.setFormacao(formacao);
		this.setCargaHoraria(cargaHoraria);
		this.setSalario(salario);
		this.setDescricaoDisciplina(descricaoDisciplina);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDescricaoDisciplina() {
		return descricaoDisciplina;
	}

	public void setDescricaoDisciplina(String descricaoDisciplina) {
		this.descricaoDisciplina = descricaoDisciplina;
	}



	public void cadastrarProfessor(String nome, String titulacao, String formacao, int cargaHoraria, float salario,
			String descricaoDisciplina) {
		this.setNome(nome);
		this.setTitulacao(titulacao);
		this.setFormacao(formacao);
		this.setCargaHoraria(cargaHoraria);
		this.setSalario(salario);
		this.setDescricaoDisciplina(descricaoDisciplina);

	}
	public void alterarProfessor(String nome, String titulacao, String formacao, int cargaHoraria, float salario,
			String descricaoDisciplina) {
		
		this.setNome(nome);
		this.setTitulacao(titulacao);
		this.setFormacao(formacao);
		this.setCargaHoraria(cargaHoraria);
		this.setSalario(salario);
		this.setDescricaoDisciplina(descricaoDisciplina);
		
	}
	
	public void alterarDescricaoDaDisciplina(String descricaoDisciplina) {
		this.setDescricaoDisciplina(descricaoDisciplina);
	}
	public void imprimirDados() {
		System.out.println("O nome: "+ nome);
		System.out.println("O nome: "+ titulacao);
		System.out.println("O nome: "+ formacao);
		System.out.println("O nome: "+ cargaHoraria);
		System.out.println("O nome: "+ salario);
		System.out.println("O nome: "+ descricaoDisciplina);
		
	}
}