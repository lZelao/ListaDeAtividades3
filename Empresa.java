package atividadeE;

public class Empresa {
	
	private  String nome;
	private String dataN;
	private String rg;
	private String cpf;
	private String Endereco;
	private String naturalidade;
	private float salario;
	private String profissao;
	private String grauDInstrucao;
	private int matricula;
	
	public Empresa( String nome,String dataN,String rg,String cpf,String Endereco,String naturalidade,float salario,
			String profissao,String grauDInstrucao,int matricula) {
		
		this.setNome(nome);
		this.setDataN(dataN);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setEndereco(Endereco);
		this.setNaturalidade(naturalidade);
		this.setSalario(salario);
		this.setProfissao(profissao);
		this.setGrauDInstrucao(grauDInstrucao);
		this.setMatricula(matricula);
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataN() {
		return dataN;
	}

	public void setDataN(String dataN) {
		this.dataN = dataN;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getGrauDInstrucao() {
		return grauDInstrucao;
	}

	public void setGrauDInstrucao(String grauDInstrucao) {
		this.grauDInstrucao = grauDInstrucao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public void cadastrarFuncionario(String nome,String dataN,String rg,String cpf,String Endereco,String naturalidade,float salario,
			String profissao,String grauDInstrucao,int matricula) {
		
		this.setNome(nome);
		this.setDataN(dataN);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setEndereco(Endereco);
		this.setNaturalidade(naturalidade);
		this.setSalario(salario);
		this.setProfissao(profissao);
		this.setGrauDInstrucao(grauDInstrucao);
		this.setMatricula(matricula);
		
		
		
	}
	public void AlterarFuncinario(String nome,String dataN,String rg,String cpf,String Endereco,String naturalidade,float salario,
			String profissao,String grauDInstrucao,int matricula) {
		
		this.setNome(nome);
		this.setDataN(dataN);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setEndereco(Endereco);
		this.setNaturalidade(naturalidade);
		this.setSalario(salario);
		this.setProfissao(profissao);
		this.setGrauDInstrucao(grauDInstrucao);
		this.setMatricula(matricula);
		
		
		
	}
	 public void listandoInformacoes() {
		 System.out.println("Nome do funcionario : " + nome );
		 System.out.println("Data de Nascimento : " + dataN );
		 System.out.println("Cpf : " + cpf );
		 System.out.println("Endereço : " + Endereco );
		 System.out.println("Naturalidade : " + naturalidade);
		 System.out.println("Salario : " + salario );
		 System.out.println("Profissão : " + profissao );
		 System.out.println("Grau de Instrução : " + grauDInstrucao );
		 System.out.println("Numero de Matricula : " + matricula );
		 
	 }
	

}
