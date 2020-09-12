package compiler.syntax.nonTerminal;

public class StmTipos extends NonTerminal {

	private SentTipo sT;

	public StmTipos() {
		super();
	}
	
	public StmTipos(SentTipo sT) {
		super();
		this.sT = sT;
	}

	public SentTipo getsT() {
		return sT;
	}
}
