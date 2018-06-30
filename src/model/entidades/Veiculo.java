package model.entidades;

public class Veiculo {
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String combustivel;
	private double quilometragem;

	public Veiculo(String placa, String modelo, int ano, String cor, String combustivel, double quilometragem) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
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
	
}
