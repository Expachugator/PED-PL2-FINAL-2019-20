package compiler.syntax.nonTerminal;

public class SentProcedure extends NonTerminal {

	private final String id;
	private ParFuncion pf;

	public SentProcedure(String id) {
		super();
		this.id = id;
	}

	public SentProcedure(String id, ParFuncion pf) {
		super();
		this.id = id;
		this.pf = pf;
	}

	public String getId() {
		return id;
	}

	public ParFuncion getPf() {
		return pf;
	}
}
