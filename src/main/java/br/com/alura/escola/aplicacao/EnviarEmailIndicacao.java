package br.com.alura.escola.aplicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

//O CONCEITO DE ENVIAR EMAIL PERTENCE A CAMADA DE APLICA��O, ENQUANTO QUE A L�GICA NECESS�RIA PARA 
//O ENVIO DO EMAIL PERTENCE � CAMADA DE INFRAESTRUTURA.
public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
