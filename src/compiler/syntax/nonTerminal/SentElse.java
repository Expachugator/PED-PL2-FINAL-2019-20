package compiler.syntax.nonTerminal;

public class SentElse extends NonTerminal{

	private Sentencias e;
	
	public SentElse() {
		super();
	}

	public SentElse(Sentencias e) {
		super();
		this.e = e;
	}

	public Sentencias getE() {
		return e;
	}
}
