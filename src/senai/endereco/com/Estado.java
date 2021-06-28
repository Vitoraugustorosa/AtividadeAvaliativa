package senai.endereco.com;

public class Estado extends Pais {
	private String nomeDoEstado;
	public String getNomeDoEstado() {
		return nomeDoEstado;
	}
	public void setNomeDoEstado(String nomeDoEstado) {
		this.nomeDoEstado = nomeDoEstado;
	}
	public String getSiglaDoEstado() {
		return siglaDoEstado;
	}
	public void setSiglaDoEstado(String siglaDoEstado) {
		this.siglaDoEstado = siglaDoEstado;
	}
	private String siglaDoEstado;

}
