package model.entidades;

public class Empregado extends Pessoa {
	private String login;
	private String senha;
	private String funcao;
	
	public Empregado(String nome, String cpf, String rg, String sexo, byte idade, String endereco, String telefone,
			String login, String senha, String funcao) {
		super(nome, cpf, rg, sexo, idade, endereco, telefone);
		this.login = login;
		this.senha = senha;
		this.funcao = funcao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
