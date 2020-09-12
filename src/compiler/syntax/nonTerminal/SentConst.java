package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class SentConst extends NonTerminal {

	private final List<ExpConst> listEC = new ArrayList<>();

	public SentConst(ExpConst eC) {
		super();
		this.listEC.add(eC);
	}

	public void addEC(ExpConst eC) {
		this.listEC.add(eC);
	}

	public List<ExpConst> getListEC() {
		return this.listEC;
	}
}