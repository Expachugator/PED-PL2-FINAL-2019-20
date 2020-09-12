package compiler.syntax.nonTerminal;

public class VBooleano extends NonTerminal{
	
	private Boolean value;
	
	public VBooleano(Boolean value) {
		super();
		this.value = value;
	}

	public Boolean getValue() {
		return value;
	}
	
}
