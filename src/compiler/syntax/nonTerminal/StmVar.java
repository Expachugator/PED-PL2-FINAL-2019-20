package compiler.syntax.nonTerminal;

public class StmVar extends NonTerminal{

	private SentVar sV;

	public StmVar(SentVar sV) {
		super();
		this.sV = sV;
	}

	public StmVar() {
		super();
	}
	
	public SentVar getsV() {
		return sV;
	}
}
