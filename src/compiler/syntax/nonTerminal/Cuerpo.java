package compiler.syntax.nonTerminal;

public class Cuerpo extends NonTerminal {

	private final StmConstantes sC;
	private final StmTipos sT;
	private final StmVar sV;
	private final StmSubprogram sS;
	private final Sentencias s;
	private final String id;

	public StmConstantes getsC() {
		return sC;
	}

	public StmTipos getsT() {
		return sT;
	}

	public StmVar getsV() {
		return sV;
	}

	public StmSubprogram getsS() {
		return sS;
	}

	public Sentencias getS() {
		return s;
	}

	public String getId() {
		return id;
	}

	public Cuerpo(StmConstantes sC, StmTipos sT, StmVar sV, StmSubprogram sS, Sentencias s, String id) {
		super();
		this.sC = sC;
		this.sT = sT;
		this.sV = sV;
		this.sS = sS;
		this.s = s;
		this.id = id;
	}
}
