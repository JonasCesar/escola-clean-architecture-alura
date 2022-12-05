package br.com.alura.escola.aplicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

//O CONCEITO DE ENVIAR EMAIL PERTENCE A CAMADA DE APLICAÇÃO, ENQUANTO QUE A LÓGICA NECESSÁRIA PARA 
//O ENVIO DO EMAIL PERTENCE À CAMADA DE INFRAESTRUTURA.
public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
