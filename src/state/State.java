package state;

import model.Pessoa;

public abstract class State {

	public abstract void alteraEstadoVacinacao(Pessoa pessoa);

	public abstract String situacaoPessoa();

}
