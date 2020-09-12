package compiler.syntax.nonTerminal;

public class IntOBool extends NonTerminal {

	private String tipo;

	public IntOBool(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
