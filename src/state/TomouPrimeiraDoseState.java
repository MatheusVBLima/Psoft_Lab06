package state;

import model.Pessoa;

public class TomouPrimeiraDoseState extends State {

	@Override
	public void alteraEstadoVacinacao(Pessoa pessoa) {
		pessoa.setEstado(new HabilitadoSegundaDoseState());
		pessoa.atualizaEstadoPessoa(pessoa);

	}

	@Override
	public String situacaoPessoa() {

		return "Pessoa tomou a primeira dose";
	}

}
