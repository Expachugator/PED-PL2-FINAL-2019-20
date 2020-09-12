package compiler.syntax.nonTerminal;

public class SentAsign extends NonTerminal {

	private final Variables v;
	private final Expresion e;

	public SentAsign(Variables v, Expresion e) {
		super();
		this.v = v;
		this.e = e;
	}

	public Variables getV() {
		return v;
	}

	public Expresion getE() {
		return e;
	}
}
