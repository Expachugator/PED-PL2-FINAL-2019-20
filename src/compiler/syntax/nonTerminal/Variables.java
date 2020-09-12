package compiler.syntax.nonTerminal;

import compiler.intermediate.Variable;

public class Variables extends NonTerminal {

	private String id;
	private IdArray idA;
	private ParFuncion pF;
	private Variable variable;

	public Variables(String id) {
		super();
		this.id = id;
	}

	public Variables(String id, IdArray idA) {
		super();
		this.id = id;
		this.idA = idA;
	}

	public Variables(String id, ParFuncion pF) {
		super();
		this.id = id;
		this.pF = pF;
	}

	public String getId() {
		return id;
	}

	public IdArray getIdA() {
		return idA;
	}

	public ParFuncion getpF() {
		return pF;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	public Variable getVariable() {
		return this.variable;
	}
}
