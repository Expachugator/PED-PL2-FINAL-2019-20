package compiler.syntax.nonTerminal;

public class ExprArit extends NonTerminal {

	private Expresion e1;
	private Expresion e2;
	private String o;
	private Integer entero;

	public ExprArit(Expresion e1, String o, Expresion e2) {
		super();
		this.e1 = e1;
		this.o = o;
		this.e2 = e2;
	}

	public ExprArit(int entero) {
		super();
		this.entero = entero;
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

	public Integer getEntero() {
		return entero;
	}
}
