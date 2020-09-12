package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class ListSentencia extends NonTerminal {

	private final List<Sentencia> listS = new ArrayList<>();
	
	public ListSentencia(Sentencia s){
		super();
		this.listS.add(s);
	}
	
	public void addS(Sentencia s){
		this.listS.add(s);
	}

	public List<Sentencia> getListS(){
		return listS;
	}

	@Override
	public List<QuadrupleIF> getIntermediateCode() {
		List<QuadrupleIF> listaQuadruples = new ArrayList<>();
		for (Sentencia sentencia : listS) {
			listaQuadruples.addAll(sentencia.getIntermediateCode());
		}
		return listaQuadruples;
	}

}
