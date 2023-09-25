package entidade;

import repositorio.RepositorioAlunos;

public class Teste {
	
	public static void main(String[] args) {
		
	/*Criação de 1 aluno*/
	Aluno lu = new Aluno();
	lu.setNome("Lucas");
	lu.setRa(126);
	lu.setCurso("Ciência da Computação");
	lu.setTurno("Noite");
	lu.setSexo('M');
	
	/*Criação do repositorio de alunos */
	RepositorioAlunos repositorioAlunos1 = new RepositorioAlunos();
	
	repositorioAlunos1.salvaAluno(lu);
	
	Aluno re = new Aluno();
	re.setNome("Renata");
	re.setRa(210);
	re.setCurso("Analista de Sistemas");
	re.setTurno("Noite");
	re.setSexo('F');
	
	repositorioAlunos1.salvaAluno(re);
	
	System.out.println(repositorioAlunos1.retornaListaAlunos());
	
	repositorioAlunos1.imprimirLista();
	
	repositorioAlunos1.atualizaAluno(lu);
	
	repositorioAlunos1.imprimirLista();
	}
	
	
}
