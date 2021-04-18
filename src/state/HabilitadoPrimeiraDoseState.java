package state;

import model.Pessoa;

public class HabilitadoPrimeiraDoseState extends State {

	@Override
	public void alteraEstadoVacinacao(Pessoa pessoa) {
		pessoa.setEstado(new TomouPrimeiraDoseState());
		pessoa.atualizaEstadoPessoa(pessoa);

	}

	@Override
	public String situacaoPessoa() {

		return "Pessoa vai tomar a primeira dose";
	}

}
