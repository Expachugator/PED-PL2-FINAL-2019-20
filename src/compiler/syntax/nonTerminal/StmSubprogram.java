package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class StmSubprogram extends NonTerminal {

	private final List<CabProcedure> listCP = new ArrayList<>();

	public StmSubprogram() {
		super();
	}	
	
	public StmSubprogram(CabProcedure cP, Cuerpo c) {
		super();
		cP.addCuerpo(c);
		listCP.add(cP);
	}

	public void addCPc(CabProcedure cP, Cuerpo c){
		cP.addCuerpo(c);
		listCP.add(cP);		
	}

	public List<CabProcedure> getListCP(){
		return listCP;
	}
}
