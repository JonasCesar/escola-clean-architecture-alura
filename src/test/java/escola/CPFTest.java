package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("345.345"));
	}
	
	@Test
	void deveriaCriarCPFComNumeroValido() {
		String numero = "123.675.234-87";
		CPF cpf = new CPF(numero);
		assertEquals(numero, cpf.getNumero());
	}

}
