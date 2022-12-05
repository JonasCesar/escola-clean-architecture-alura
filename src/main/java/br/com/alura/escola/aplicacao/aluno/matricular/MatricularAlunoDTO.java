package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDTO {
	
	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {		
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}
	
	public Aluno criarAluno(MatricularAlunoDTO dto) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno novoAluno = fabrica.comNomeCPFEmail(dto.nomeAluno, dto.cpfAluno, dto.emailAluno).criar();
		return novoAluno;
	}
	

}
