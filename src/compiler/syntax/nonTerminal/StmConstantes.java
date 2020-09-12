package compiler.syntax.nonTerminal;

public class StmConstantes extends NonTerminal {

	private SentConst sC;

	public StmConstantes() {
		super();
	}

	public StmConstantes(SentConst sC) {
		super();
		this.sC = sC;
	}

	public SentConst getSC() {
		return sC;
	}
}
