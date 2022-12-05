package br.com.alura.escola.aplicacao.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

//O CONCEITO DE ENVIAR EMAIL PERTENCE A CAMADA DE APLICAÇÃO, ENQUANTO QUE A LÓGICA NECESSÁRIA PARA 
//O ENVIO DO EMAIL PERTENCE À CAMADA DE INFRAESTRUTURA.
public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}


/*
 * Nota
 * 
 * 	- Domain Services são classes que representam uma ação entre mais de uma entidade.
 *	- Application Services controlam o fluxo de alguma regra em nossa aplicação.
 *	- Infrastructure Services são implementações de interfaces presentes nas camadas de domínio ou de aplicação.
 * 
 */
