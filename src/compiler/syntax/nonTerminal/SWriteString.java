package compiler.syntax.nonTerminal;

public class SWriteString extends NonTerminal{
	
	private final String s;
	
	public SWriteString(String s) {
		super();
		this.s = s;
	}
	
	public String getS(){
		return s;
	}
}
