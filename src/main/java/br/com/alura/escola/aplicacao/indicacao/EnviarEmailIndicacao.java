package br.com.alura.escola.aplicacao.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

//O CONCEITO DE ENVIAR EMAIL PERTENCE A CAMADA DE APLICA��O, ENQUANTO QUE A L�GICA NECESS�RIA PARA 
//O ENVIO DO EMAIL PERTENCE � CAMADA DE INFRAESTRUTURA.
public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}


/*
 * Nota
 * 
 * 	- Domain Services s�o classes que representam uma a��o entre mais de uma entidade.
 *	- Application Services controlam o fluxo de alguma regra em nossa aplica��o.
 *	- Infrastructure Services s�o implementa��es de interfaces presentes nas camadas de dom�nio ou de aplica��o.
 * 
 */
