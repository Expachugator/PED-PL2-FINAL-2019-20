package compiler.syntax.nonTerminal;

public class ExpVar extends NonTerminal {

	private final CadIdVar cIdV;
	private final TipoVar tV;

	public ExpVar(CadIdVar cIdV, TipoVar tV) {
		super();
		this.cIdV = cIdV;
		this.tV = tV;
	}

	public CadIdVar getcIdV() {
		return cIdV;
	}

	public TipoVar gettV() {
		return tV;
	}
}
