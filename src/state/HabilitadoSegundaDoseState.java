package state;

import model.Pessoa;

public class HabilitadoSegundaDoseState extends State {

	@Override
	public void alteraEstadoVacinacao(Pessoa pessoa) {
		pessoa.setEstado(new FinalizadaVacinacaoState());
		pessoa.atualizaEstadoPessoa(pessoa);

	}

	@Override
	public String situacaoPessoa() {

		return "Pessoa vai tomar a segunda dose";
	}

}
