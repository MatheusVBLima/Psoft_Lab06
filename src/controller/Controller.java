package controller;

import java.util.HashMap;
import java.util.Map;

import model.Pessoa;

public class Controller {

	Map<String, Pessoa> mapPessoas = new HashMap<String, Pessoa>();

	public void cadastraPessoa(String nome, String cpf, String endereco, String numCartao, String email,
			String telefone, String profissao, int idade, String comorbidades) {
		if(!existePessoa(cpf)) {
			mapPessoas.put(cpf, new Pessoa(nome, cpf, endereco, numCartao, email, telefone, profissao, idade, comorbidades));
			System.out.println("Cadastro realizado com sucesso");
		}else {
			throw new IllegalArgumentException("Pessoa já cadastrada");
		}

	}

	private boolean existePessoa(String cpf) {
		if (mapPessoas.containsKey(cpf)) {
			return true;
		} else {
			return  false;
		}
		
	}

}
