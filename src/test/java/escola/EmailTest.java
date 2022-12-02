package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
