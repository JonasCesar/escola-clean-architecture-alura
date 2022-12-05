package br.com.alura.escola.dominio.aluno;

//Essa interface fica na camada de dom�nio pois representa o conceito de cifrar uma senha (conceito pertencente ao dom�nio).
//Agora como esse processo de cifra vai acontecer diz respeito � camada de infraestrutura (implementa��o do servi�o de cifrar senha).
public interface CifradorDeSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
