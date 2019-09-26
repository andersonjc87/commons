package br.com.fast.commons.util.enumeration;


/***
 * @author Julio Escobar 
 * 
 * Enum OSA
 */
public enum OSAEnum {

  	FAST("Fast", 5);		

    private String descricao;
    private int valor;

    private OSAEnum(String descricao, int valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getValor(){
    	return valor;
    }
}
