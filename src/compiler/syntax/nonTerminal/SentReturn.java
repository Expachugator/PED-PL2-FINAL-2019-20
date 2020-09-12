package compiler.syntax.nonTerminal;

public class SentReturn extends NonTerminal {

	public Expresion getE() {
		return e;
	}

	private final Expresion e;

	public SentReturn(Expresion e) {
		super();
		this.e = e;
	}
}
