package senai.aluno.com;

import senai.curso.com.Curso;
import senai.endereco.com.Endereco;

public class Aluno extends Endereco {
	private String nomeAluno;
	private int idadeAluno;
	private String curso;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int i) {
		this.idadeAluno = i;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(Curso curso2) {
		this.curso = curso;
	}
	
	
}

