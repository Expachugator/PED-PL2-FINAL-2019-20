package compiler.syntax.nonTerminal;

public class ExpTipo extends NonTerminal {

	private final String id;
	private final EntOid eOid1;
	private final EntOid eOid2;
	private final IntOBool iOB;

	public ExpTipo(String id, EntOid eOid1, EntOid eOid2, IntOBool iOB) {
		super();
		this.id = id;
		this.eOid1 = eOid1;
		this.eOid2 = eOid2;
		this.iOB = iOB;
	}

	public String getId() {
		return id;
	}

	public EntOid geteOid1() {
		return eOid1;
	}

	public EntOid geteOid2() {
		return eOid2;
	}

	public IntOBool getiOB() {
		return iOB;
	}
}
