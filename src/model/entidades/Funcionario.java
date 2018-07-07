package model.entidades;

import java.util.Date;

public class Funcionario extends Pessoa{
	private String cargo;
	private byte cargaHorSem;
	private float salario;
	private Date dataEntrada;
	
	public Funcionario(String nome, String cpf, String rg, String sexo, Date dataNascimento, String rua, int numCasa,
			String bairro, String cidade, String estado, String telefone, String cargo, byte cargaHorSem, float salario,
			Date dataEntrada) {
		super(nome, cpf, rg, sexo, dataNascimento, rua, numCasa, bairro, cidade, estado, telefone);
		this.cargo = cargo;
		this.cargaHorSem = cargaHorSem;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public byte getCargaHorSem() {
		return cargaHorSem;
	}

	public void setCargaHorSem(byte cargaHorSem) {
		this.cargaHorSem = cargaHorSem;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
}
