package AtividadeD;

import AtividadeD.Professor;

public class FaculdadeXPTO {

	public static void main(String[] args) {
		Professor p1 = new Professor("null","null","null",0,0,"null");
        
		p1.cadastrarProfessor("Marcos","Professor", "Matematica", 40, 4000, "Matematica basica para alunos ingressantes");
		p1.imprimirDados();
		
		
		System.out.println("-------------Descriçao Alterada--------------------------------------");
		p1.alterarDescricaoDaDisciplina("Para alunos avançados do 8o semestre");
		p1.imprimirDados();
	}

}
