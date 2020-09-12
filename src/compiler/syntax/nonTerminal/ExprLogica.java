package compiler.syntax.nonTerminal;

public class ExprLogica extends NonTerminal{
	
	private Expresion e1;
	private Expresion e2;
	private String o;
	private Boolean vB;
	
	public ExprLogica(Expresion e1, String o, Expresion e2) {
		super();
		this.e1 = e1;
		this.o = o;
		this.e2 = e2;
	}

	public ExprLogica(String o, Expresion e1) {
		super();
		this.o = o;
		this.e1 = e1;
	}
	public ExprLogica(Boolean vB) {
		super();
		this.vB = vB;
	}

	public Expresion getE1() {
		return e1;
	}

	public Expresion getE2() {
		return e2;
	}

	public String getO() {
		return o;
	}

	public Boolean getVB() {
		return vB;
	}
}
