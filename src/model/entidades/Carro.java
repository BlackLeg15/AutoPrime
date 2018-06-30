package model.entidades;

public class Carro extends Veiculo {
	private byte tipoDeCambio;
	private String opcionais;
	
	public Carro(String placa, String modelo, int ano, String cor, String combustivel, double quilometragem,
			byte tipoDeCambio, String opcionais) {
		super(placa, modelo, ano, cor, combustivel, quilometragem);
		this.tipoDeCambio = tipoDeCambio;
		this.opcionais = opcionais;
	}
	
	public byte getTipoDeCambio() {
		return tipoDeCambio;
	}
	public void setTipoDeCambio(byte tipoDeCambio) {
		this.tipoDeCambio = tipoDeCambio;
	}
	public String getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(String opcionais) {
		this.opcionais = opcionais;
	}
	
}
