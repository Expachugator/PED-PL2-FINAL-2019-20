package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class SentTipo extends NonTerminal {

	private final List<ExpTipo> listET = new ArrayList<>();
	
	public SentTipo(ExpTipo eT){
		super();
		this.listET.add(eT);
	}

	public void addET(ExpTipo eT){
		this.listET.add(eT);
	}

	public List<ExpTipo> getListET() {
		return this.listET;
	}
	
}
