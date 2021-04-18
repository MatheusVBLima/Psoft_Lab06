package model;

import state.PessoaNaoVacinadaState;
import state.State;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endereco;
	private String numCartao;
	private String email;
	private String telefone;
	private String profissao;
	private int idade;
	private String[] comorbidades;
	private State estado;

	public Pessoa(String nome, String cpf, String endereco, String numCartao, String email, String telefone,
			String profissao, int idade, String comorbidades) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numCartao = numCartao;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.idade = idade;
		this.comorbidades = comorbidades.split(", ");
		this.estado = new PessoaNaoVacinadaState();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String[] getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(String[] comorbidades) {
		this.comorbidades = comorbidades;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void atualizaEstadoPessoa(Pessoa pessoa) {
		estado.alteraEstadoVacinacao(pessoa);
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
