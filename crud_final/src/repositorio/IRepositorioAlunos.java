package repositorio;

import java.util.List;

import entidade.Aluno;

public interface IRepositorioAlunos {

	public boolean salvaAluno(Aluno aluno);
	public List<Aluno> retornaListaAlunos();
	public boolean atualizaAluno(Aluno aluno);
	public boolean deletaAluno(int ra);
	
}
