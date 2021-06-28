package senai.endereco.com;

public class Endereco extends Cidade{ // ATIVIDADE 
	
	private String nomeDoBairro;
	public String getNomeDoBairro() {
		return nomeDoBairro;
	}
	public void setNomeDoBairro(String nomeDoBairro) {
		this.nomeDoBairro = nomeDoBairro;
	}
	public String getNomeDarua() {
		return nomeDarua;
	}
	public void setNomeDarua(String nomeDarua) {
		this.nomeDarua = nomeDarua;
	}
	public int getNumeroDaRua() {
		return numeroDaRua;
	}
	public void setNumeroDaRua(int numeroDaRua) {
		this.numeroDaRua = numeroDaRua;
	}
	private String nomeDarua;
	private int numeroDaRua;
	

}
