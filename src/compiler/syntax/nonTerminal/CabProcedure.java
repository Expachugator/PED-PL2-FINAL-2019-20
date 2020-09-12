package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.ScopeIF;

public class CabProcedure extends NonTerminal{

	private final String id;
	private final ScopeIF scope;
	private final ProcParenParam pP;
	private final TipoRetorno tR;
	private Cuerpo c;

	public CabProcedure(String id, ScopeIF scope, ProcParenParam pP, TipoRetorno tR) {
		super();
		this.id = id;
		this.scope = scope;
		this.pP = pP;
		this.tR = tR;
	}

	public void addCuerpo(Cuerpo c) {
		this.c = c;
	}
	
	public String getId() {
		return id;
	}

	public ProcParenParam getpP() {
		return pP;
	}

	public TipoRetorno gettR() {
		return tR;
	}
}
