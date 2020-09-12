package compiler.syntax.nonTerminal;

public class TipoVar extends NonTerminal {

	private IntOBool iOB;
	private String id;

	public TipoVar(IntOBool iOB) {
		super();
		this.iOB = iOB;
	}

	public TipoVar(String id) {
		super();
		this.id = id;
	}

	public IntOBool getIOB() {
		return iOB;
	}

	public String getId() {
		return id;
	}

	public String getIdentificadorTipo() {
		if (esTipoCustom()) {
			return id;
		} else {
			return iOB.getTipo();
		}
	}

	public boolean esTipoCustom() {
		return id != null;
	}	
}
