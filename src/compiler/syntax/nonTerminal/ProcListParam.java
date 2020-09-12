package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class ProcListParam extends NonTerminal {

	private final List<ProcParam> listPP = new ArrayList<>();

	public ProcListParam(ProcParam pP) {
		super();
		this.listPP.add(pP);
	}

	public ProcListParam() {
		super();
	}

	public void addPP(ProcParam pP) {
		this.listPP.add(pP);
	}

	public List<ProcParam> getlistPP() {
		return listPP;
	}
}
