package br.com.alura.escola.dominio.aluno;
//SERVIÇO DE DOMÍNIO DE CIFRAR SENHA
//Essa interface fica na camada de domínio pois representa o conceito de cifrar uma senha (conceito pertencente ao domínio).
//Agora como esse processo de cifra vai acontecer diz respeito à camada de infraestrutura (implementação do serviço de cifrar senha).
public interface CifradorDeSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
