package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolConstant.
 */

// TODO: Student work
// Include properties to characterize constants

public class SymbolConstant extends SymbolBase {

	private int value;
	private boolean bool;

	/**
	 * Constructor for SymbolConstant.
	 * 
	 * @param scope
	 *            The declaration scope.
	 * @param name
	 *            The symbol name.
	 * @param type
	 *            The symbol type.
	 * @param value 
	 */
	public SymbolConstant(ScopeIF scope, String name, TypeIF type, int value) {
		super(scope, name, type);
		this.value = value;
	}

	/**
	 * Constructor for SymbolConstant.
	 * 
	 * @param scope
	 *            The declaration scope.
	 * @param name
	 *            The symbol name.
	 * @param type
	 *            The symbol type.
	 * @param bool 
	 */
	public SymbolConstant(ScopeIF scope, String name, TypeIF type, boolean bool) {
		super(scope, name, type);
		this.bool = bool;
	}

	public int getValue() {
		return value;
	}

	public boolean isBool() {
		return bool;
	}
}