package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	
	private Aluno aluno;
	
	@BeforeEach
	void beforeEach() {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		aluno = fabrica.comNomeCPFEmail("Aluno teste", "123.534.643-12", "teste@gmail.com").criar();
	}

	
	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("22", "45678765");
		assertEquals(1, aluno.getTelefones().size());
	}
	
	@Test
	void deveriaPermitirAdicionar2Telefones() {
		this.aluno.adicionarTelefone("22", "456543456");
		this.aluno.adicionarTelefone("22", "45678765");
	}
	
	@Test
	void naoDeveriaPermitirAdicionar3Telefones() {
		assertThrows(IllegalArgumentException.class, ()-> {
			this.aluno.adicionarTelefone("22", "456543456");
			this.aluno.adicionarTelefone("22", "45678765");
			this.aluno.adicionarTelefone("22", "88888888");
		});
	}

}
