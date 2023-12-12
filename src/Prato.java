
public class Prato {
	private String nomeP;
	private String descricaoP;
	private double precoP;
	
	public Prato(String nomeP, String descricaoP, double precoP){
		this.nomeP = nomeP;
		this.descricaoP = descricaoP;
		this.precoP = precoP;
	}

	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public String getDescricaoP() {
		return descricaoP;
	}
	public void setDescricaoP(String descricaoP) {
		this.descricaoP = descricaoP;
	}

	public double getPrecoP() {
		return precoP;
	}
	public void setPrecoP(double precoP) {
		this.precoP = precoP;
	}
	
}