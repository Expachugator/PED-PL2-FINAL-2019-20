package compiler.syntax.nonTerminal;

public class TipoRetorno extends NonTerminal {

	private IntOBool iOB;

	public TipoRetorno() {
		super();
	}
	
	public TipoRetorno(IntOBool iOB) {
		super();
		this.iOB = iOB;
	}

	public IntOBool getiOB() {
		return iOB;
	}
}
