package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.LabelIF;

/**
 * Abstract Class for Axiom non terminal.
 */
public abstract class Axiom extends NonTerminal {
	private final CabModule cabModule;
	private final Cuerpo cuerpo;

	public Axiom(CabModule cM, Cuerpo c) {
		super();
		this.cabModule = cM;
		this.cuerpo = c;
	}

	public CabModule getCabModule() {
		return cabModule;
	}

	public Cuerpo getCuerpo() {
		return cuerpo;
	}

	public abstract void setLabel(LabelIF label);

	public abstract LabelIF getLabel();
}
