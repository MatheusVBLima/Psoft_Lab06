package state;

import model.Pessoa;

public class FinalizadaVacinacaoState extends State {

	@Override
	public void alteraEstadoVacinacao(Pessoa pessoa) {

	}

	@Override
	public String situacaoPessoa() {
		return "Pessoa tomou a segunda dose.Com isso, chegamos ao fim da vacinação";
	}

}
