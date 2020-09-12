package compiler.syntax.nonTerminal;

public class Sentencias extends NonTerminal{
	
	private ListSentencia lS;

	public Sentencias() {
		super();
	}

	public Sentencias(ListSentencia lS) {
		super();
		this.lS = lS;
	}

	public ListSentencia getlS() {
		return lS;
	}
}
