package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

//Essa classe pode ser considerada uma use case do clean architecture
public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	
	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// Padr�o command
	public void executa(MatricularAlunoDTO dados) {
		Aluno novo = dados.criarAluno(dados);
		repositorio.matricular(novo);
	}

}
