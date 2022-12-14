package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("sdfgd.com"));
	}
	
	@Test
	void deveCriarEmailComEnderecoValido() {
		String endereco = "jonascesar@gmail.com";
		Email email = new Email(endereco);
		assertEquals(endereco, email.getEndereco());
	}

}
