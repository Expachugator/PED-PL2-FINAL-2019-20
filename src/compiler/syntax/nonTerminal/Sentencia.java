package compiler.syntax.nonTerminal;

public class Sentencia extends NonTerminal {

	private SentAsign sA;
	private SentIf sI;
	private SentFor sF;
	private SentReturn sR;
	private SWriteString sWS;
	private SWriteInt sWI;
	private SWriteLn sWL;
	private SentProcedure sP;

	public Sentencia(SentAsign sA) {
		super();
		this.sA = sA;
	}

	public Sentencia(SentIf sI) {
		super();
		this.sI = sI;
	}

	public Sentencia(SentFor sF) {
		super();
		this.sF = sF;
	}

	public Sentencia(SentReturn sR) {
		super();
		this.sR = sR;
	}

	public Sentencia(SWriteString sWS) {
		super();
		this.sWS = sWS;
	}

	public Sentencia(SWriteInt sWI) {
		super();
		this.sWI = sWI;
	}

	public Sentencia(SWriteLn sWL) {
		super();
		this.sWL = sWL;
	}

	public Sentencia(SentProcedure sP) {
		super();
		this.sP = sP;
	}

	public SentAsign getsA() {
		return sA;
	}

	public SentIf getsI() {
		return sI;
	}

	public SentFor getsF() {
		return sF;
	}

	public SentReturn getsR() {
		return sR;
	}

	public SWriteString getsWS() {
		return sWS;
	}

	public SWriteInt getsWI() {
		return sWI;
	}

	public SWriteLn getsWL() {
		return sWL;
	}

	public SentProcedure getsP() {
		return sP;
	}

}
