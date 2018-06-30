package model;

public class Cliente extends Pessoa {
	private String aluga;
	private String cnh;
	private Empregado cadastrante;
	
	public Cliente(String nome, String cpf, String rg, String sexo, byte idade, String endereco, String telefone,
			String aluga, String cnh, Empregado cadastrante) {
		super(nome, cpf, rg, sexo, idade, endereco, telefone);
		this.aluga = aluga;
		this.cnh = cnh;
		this.cadastrante = cadastrante;
	}

	public String getAluga() {
		return aluga;
	}

	public void setAluga(String aluga) {
		this.aluga = aluga;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Empregado getCadastrante() {
		return cadastrante;
	}

	public void setCadastrante(Empregado cadastrante) {
		this.cadastrante = cadastrante;
	}
	
}
