package state;

import model.Pessoa;

public class PessoaNaoVacinadaState extends State {

	@Override
	public void alteraEstadoVacinacao(Pessoa pessoa) {
		if (pessoa.getIdade() >= 60 | pessoa.getComorbidades().length >= 1
				| pessoa.getProfissao().toUpperCase() == "Sa�de") {
			System.out.println("Voc� pode tomar a primeira dose da vacina");
			pessoa.setEstado(new HabilitadoPrimeiraDoseState());
			pessoa.atualizaEstadoPessoa(pessoa);

		} else {
			System.out.println("Voc� n�o pode tomar a vacina");
		}

	}

	@Override
	public String situacaoPessoa() {
		return "Pessoa n�o vacinada";
	}

}
