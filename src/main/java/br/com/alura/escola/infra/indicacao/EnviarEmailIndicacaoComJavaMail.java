package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.EnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarPara(Aluno indicado) {
		// L�gica de envil de email com a lib JavaMail
		
	}

}