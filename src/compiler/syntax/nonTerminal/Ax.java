package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.LabelIF;

public class Ax extends Axiom {

	private LabelIF label;

	/**
	 * Constructor for Axiom.
	 */
	public Ax(CabModule cabModule, Cuerpo cuerpo) {
		super(cabModule, cuerpo);
	}

	public void setLabel(LabelIF label) {
		this.label = label;
	}

	public LabelIF getLabel() {
		return label;
	}
}
