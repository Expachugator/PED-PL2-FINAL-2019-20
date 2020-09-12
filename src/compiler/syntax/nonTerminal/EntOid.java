package compiler.syntax.nonTerminal;

public class EntOid extends NonTerminal {

	private String nombreId;
	private String tipo;
	private int valor;
	
	public EntOid(String nombreId, String tipo) {
		super();
		this.nombreId = nombreId;
		this.tipo = tipo;
	}

	public EntOid(int valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}	
	
	public String getNombreId() {
		return nombreId;
	}

	public int getValor() {
		return valor;
	}
	
	public String getTipo() {
		return tipo;
	}

}
