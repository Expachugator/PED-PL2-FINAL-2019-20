package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class Expresion extends NonTerminal {

	private List<Expresion> listE = new ArrayList<>();
	private ExprArit eA;
	private ExprLogica eL;
	private Variables v;
	private String tipo;
	private String id;
	
	public Expresion(Expresion e){
		super();
		this.listE.add(e);
	}
	
	public void addE(Expresion e){
		this.listE.add(e);
	}
	
	public Expresion(ExprArit eA) {
		super();
		this.eA = eA;
		this.tipo = "Aritmetica";
	}

	public Expresion(ExprLogica eL) {
		super();
		this.eL = eL;
		this.tipo = "Logica";
	}

	public Expresion(Variables v) {
		super();
		this.v = v;
		this.tipo = "Variable";
	}

	public List<Expresion> getListE() {
		return listE;
	}

	public ExprArit geteA() {
		return eA;
	}

	public ExprLogica geteL() {
		return eL;
	}

	public Variables getV() {
		return v;
	}

	public Object getValue() {
		if (eA != null) {
			return eA.getEntero();
		}
		if (eL != null) {
			return eL.getVB();
		}
		return 1;
	}

	public String getTipo() {
		return tipo;
	}

}
