package compiler.syntax.nonTerminal;

public class ProcParam extends NonTerminal {

	private final CadIdVar cIdV;
	private final TipoVar tV;

	public CadIdVar getcIdV() {
		return cIdV;
	}

	public TipoVar gettV() {
		return tV;
	}

	public ProcParam(CadIdVar cIdV, TipoVar tV) {
		super();
		this.cIdV = cIdV;
		this.tV = tV;
	}
}
