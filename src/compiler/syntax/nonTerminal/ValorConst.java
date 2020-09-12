package compiler.syntax.nonTerminal;

public class ValorConst extends NonTerminal {

	private Integer entero;
	private Boolean bool;

	public ValorConst(int entero) {
		super();
		this.entero = entero;
	}

	public ValorConst(Boolean vb) {
		super();
		this.bool = vb;
	}

	public int getEntero() {
		return entero;
	}

	public Boolean getBool() {
		return bool;
	}	
}
