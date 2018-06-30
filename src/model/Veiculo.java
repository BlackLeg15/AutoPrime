package model;

public class Veiculo {
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String combustivel;
	private double quilometragem;
	private String tipoCambio;
	private String opcionais;

	public Veiculo(String placa, String modelo, int ano, String cor, String combustivel, double quilometragem,
			String tipoCambio, String opcionais) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
		this.tipoCambio = tipoCambio;
		this.opcionais = opcionais;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public String getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}
	
}
