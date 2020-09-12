package compiler.syntax.nonTerminal;

public class IdArray extends NonTerminal{

	private final Expresion e;
	
	public IdArray(Expresion e) {
		super();
		this.e = e;
	}
	
	public Expresion getE(){
		return e;
	}
}
