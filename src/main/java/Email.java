//foi feito uma classe email pq aqui teremos uma valida��o do valor
//Essa classe n�o � uma entidade no clean architecture, ela � uma value object (podem existir aqui dois objetos com o mesmo valor)
public class Email {
	
	private String endereco;
	
	public Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Endere�o de email inv�lico!");
		}
		this.endereco = endereco;
	}
	

}
