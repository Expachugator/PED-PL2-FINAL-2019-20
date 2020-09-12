package compiler.syntax.nonTerminal;

public class SentIf extends NonTerminal{

	private final Expresion e;
	private final Sentencias s;
	private final SentElse sE;
	
	public SentIf(Expresion e, Sentencias s, SentElse sE) {
		super();
		this.e = e;
		this.s = s;
		this.sE = sE;
	}

	public Expresion getE() {
		return e;
	}

	public Sentencias getS() {
		return s;
	}

	public SentElse getsE() {
		return sE;
	}
}
