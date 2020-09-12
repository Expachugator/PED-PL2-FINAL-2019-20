package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class CadIdVar extends NonTerminal {

	private final List<String> listId = new ArrayList<>();
	
	public CadIdVar(String id){
		super();
		this.listId.add(id);
	}
	
	public void addId(String id){
		this.listId.add(id);
	}
	
	public List<String> getListId(){
		return listId;
	}
}
