package model.entidades;

public class Carro extends Veiculo {
	private String chassi;
	private byte tipoDeCambio;
	private String opcionais;
	
	public Carro(String placa, String modelo, int ano, String cor, String combustivel, double quilometragem,
			String chassi, byte tipoDeCambio, String opcionais) {
		super(placa, modelo, ano, cor, combustivel, quilometragem);
		this.chassi = chassi;
		this.tipoDeCambio = tipoDeCambio;
		this.opcionais = opcionais;
	}
	public String getOpcionais() {
		return opcionais;
	}
	public String getChassi() {
		return chassi;
	}
	public byte getTipoDeCambio() {
		return tipoDeCambio;
	}
	public void setTipoDeCambio(byte tipoDeCambio) {
		this.tipoDeCambio = tipoDeCambio;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}
	//alteração linha
}
