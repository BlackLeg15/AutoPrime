package model.entidades;

import java.util.Date;

public class Cliente extends Pessoa {
	private int numAlugueis;
	private String cnh;
	
	public Cliente(String nome, String cpf, String rg, String sexo, Date dataNascimento, String rua, int numCasa,
			String bairro, String cidade, String estado, String telefone, int numAlugueis, String cnh) {
		super(nome, cpf, rg, sexo, dataNascimento, rua, numCasa, bairro, cidade, estado, telefone);
		this.numAlugueis = numAlugueis;
		this.cnh = cnh;
	}

	public int getNumAlugueis() {
		return numAlugueis;
	}

	public void setNumAlugueis(int numAlugueis) {
		this.numAlugueis = numAlugueis;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
}
