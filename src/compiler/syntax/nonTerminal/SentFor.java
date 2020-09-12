package compiler.syntax.nonTerminal;

public class SentFor extends NonTerminal{

	private final String id;
	private final Expresion e1;
	private final Expresion e2;
	private final Sentencias s;
	
	public SentFor(String id, Expresion e1, Expresion e2, Sentencias s) {
		super();
		this.id = id;
		this.e1 = e1;
		this.e2 = e2;
		this.s = s;
	}

	public String getId() {
		return id;
	}

	public Expresion getE1() {
		return e1;
	}

	public Expresion getE2() {
		return e2;
	}

	public Sentencias getS() {
		return s;
	}
}
