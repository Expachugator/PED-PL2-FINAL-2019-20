package compiler.syntax.nonTerminal;

public class ExpConst extends NonTerminal {

	private final String id;
	private final ValorConst vC;

	public ExpConst(String id, ValorConst vC) {
		super();
		this.id = id;
		this.vC = vC;
	}

	public String getId() {
		return id;
	}

	public ValorConst getVC() {
		return vC;
	}

}
