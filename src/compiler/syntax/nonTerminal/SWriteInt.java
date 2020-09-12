package compiler.syntax.nonTerminal;

public class SWriteInt extends NonTerminal{

	private final Expresion e;
	
	public SWriteInt(Expresion e) {
		super();
		this.e = e;
	}
	
	public Expresion getE(){
		return e;
	}
}
