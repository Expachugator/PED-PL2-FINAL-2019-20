package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class SentVar extends NonTerminal {

	private final List<ExpVar> listEV = new ArrayList<>();

	public SentVar(ExpVar eV) {
		super();
		this.listEV.add(eV);
	}

	public void addEV(ExpVar eV) {
		this.listEV.add(eV);
	}

	public List<ExpVar> getListEV() {
		return this.listEV;
	}
}
