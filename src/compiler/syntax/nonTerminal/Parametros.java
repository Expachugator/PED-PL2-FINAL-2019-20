package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Parametros extends NonTerminal {

	private final List<Expresion> listE = new ArrayList<>();
	
	public Parametros(Expresion e){
		super();
		this.listE.add(e);
	}

	public void addE(Expresion e){
		this.listE.add(e);
	}
	
	public List<Expresion> getListE(){
		return listE;
	}
}
