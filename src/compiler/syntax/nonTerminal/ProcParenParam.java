package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class ProcParenParam extends NonTerminal {

	private ProcListParam pLP;

	public ProcParenParam() {
		super();
	}

	public ProcParenParam(ProcListParam pLP) {
		super();
		this.pLP = pLP;
	}

	public ProcListParam getpLP() {
		return pLP;
	}

	public List<ProcParam> getProcParams(){
		List<ProcParam> params = new ArrayList<>();
		for(ProcParam procParam : pLP.getlistPP()){
			params.add(procParam);
		}
		return params;
	}
}
