package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// eu poderia usar o mockito para fazer o repositorio ser um mock
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDTO dados = new MatricularAlunoDTO("Fernando souza", "895.369.845-17", "fernando@gmail.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("895.369.845-17"));
		
		assertEquals("Fernando souza", encontrado.getNome());
		assertEquals("895.369.845-17", encontrado.getCpf().getNumero());
		assertEquals("fernando@gmail.com", encontrado.getEmail().getEndereco());
		
	}

}
