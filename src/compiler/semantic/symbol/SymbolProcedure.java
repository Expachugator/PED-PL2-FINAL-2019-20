package compiler.semantic.symbol;

import compiler.syntax.nonTerminal.CabProcedure;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

// TODO: Student work
// Include properties to characterize procedure calls

public class SymbolProcedure extends SymbolBase {

	private int size;
	private int tempSize;
	
	private final CabProcedure cP;

	/**
	 * Constructor for SymbolProcedure.
	 * 
	 * @param scope
	 *            The declaration scope.
	 * @param name
	 *            The symbol name.
	 * @param type
	 *            The symbol type.
	 * @param cabProcedure
	 */
	public SymbolProcedure(ScopeIF scope, String name, TypeIF type, CabProcedure cabProcedure) {
		super(scope, name, type);
		this.cP = cabProcedure;
	}

	public CabProcedure getcP() {
		return cP;
	}
	public void incrementSize(int size) {
		this.size += size;
	}
	public void incrementSize() {
		size += 1;
	}

	public void incrementTempSize(int tempSize) {
		this.tempSize += tempSize;
	}

	public void incrementTempSize() {
		this.tempSize++;
	}

	public int getSize() {
		return size;
	}

	public int getParamSize() {
		return this.getSize() - tempSize;
	}

}
