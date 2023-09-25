package repositorio;

import entidade.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioAlunos implements IRepositorioAlunos{
	
	List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	
	@Override
	public boolean salvaAluno(Aluno aluno) {
		boolean ok;
		try {
			ok=listaAlunos.add(aluno);
			System.out.println("Aluno salvo.");
		} catch (Exception e) {
			ok=false;
			System.out.println("Aluno não foi salvo. Ocorreu um erro.");
		}
		return ok;
	}/*fim do salvaAluno*/
	
	/*Método retorna as posições dos objetos na memória*/
	@Override
	public List<Aluno> retornaListaAlunos() {
		return listaAlunos;
	}
	
	
	@Override
	public boolean atualizaAluno(Aluno aluno) {
		/* try catch para descobrir se o aluno está matriculado */
		try {
			/*if else if para descobrir qual/quais dados estão errados*/
			if (listaAlunos.contains(aluno) == true) {
				System.out.println("Digite qual dado deve ser alterado no aluno: nome, curso, turno, sexo ou todos.");
				String dadosErrados = new Scanner(System.in).nextLine();
				dadosErrados.toLowerCase();
				boolean attempt = false;
				/*while implementado para dar chance de erro de digitação ao user */
				while (attempt == false) {
					switch(dadosErrados)  {
						case "nome":
						System.out.println("Digite o novo nome:");
						String novoNome = new Scanner(System.in).nextLine();
						aluno.setNome(novoNome);
						attempt = true;
						break;
						
						case "curso":						
						System.out.println("Digite o novo curso:");
						String novoCurso = new Scanner(System.in).nextLine();
						aluno.setCurso(novoCurso);
						attempt = true;
						break;
						
						case "turno":						
						System.out.println("Digite o novo turno:");
						String novoTurno = new Scanner(System.in).nextLine();
						aluno.setTurno(novoTurno);
						attempt = true;
						break;
						
						case "sexo":						
						System.out.println("Digite o novo sexo:");
						char novoSexo = new Scanner(System.in).next().charAt(0);
						aluno.setSexo(novoSexo);
						attempt = true;
						break;
						
						default:						
						System.out.println("Digite o novo nome:");
						String novoNome2 = new Scanner(System.in).nextLine();
						aluno.setNome(novoNome2);
						System.out.println("Digite o novo curso:");
						String novoCurso2 = new Scanner(System.in).nextLine();
						aluno.setCurso(novoCurso2);
						System.out.println("Digite o novo turno:");
						String novoTurno2 = new Scanner(System.in).nextLine();
						aluno.setTurno(novoTurno2);
						System.out.println("Digite o novo sexo:");
						char novoSexo2 = new Scanner(System.in).next().charAt(0);
						aluno.setSexo(novoSexo2);
						attempt = true;
						break;
						
						
					} 
					} /*fim do while*/
				
			} /*fim do if else */
		} catch (Exception e) {
			return false;
		}
		return true;
	}/*fim do atualiza aluno*/
	
	@Override
	public boolean deletaAluno(int ra) {
		try {
			System.out.println("O aluno " + listaAlunos.get(listaAlunos.indexOf(ra)).getNome() + " foi removido.");
			listaAlunos.remove(ra);
			
		} catch (Exception e) {
			System.out.println("O aluno com ra " + ra + " não foi encontrado em nossos registros.");
			return false;
		}
			return true;
	}/*fim do deletaAluno */
	
	public void imprimirLista() {
		
		try {
			for (int i = 0; i < listaAlunos.size(); i++) {
				System.out.println(listaAlunos.get(i).getDados());
			}
			
		} catch (Exception e) {
			System.out.println("Não há nenhum aluno matriculado.");
			
		}
		
	}
}
