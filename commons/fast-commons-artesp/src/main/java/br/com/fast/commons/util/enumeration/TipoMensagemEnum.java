package br.com.fast.commons.util.enumeration;

/***
 * @author Julio Escobar
 *         Enum Tipo Mensagem
 */
public enum TipoMensagemEnum {

    PASSAGEM("Pasagens", 1),
    IMAGEM("Imagens", 2),
    TARIFA("Tarifas", 3),
    SEQUENCIAL_TAG("Sequencial Tags", 4),
    PASSAGEM_PROCESSADA("Passagens Processadas", 5),
    TAG("Tags", 6),
    REQUISITA_IMAGEM("Requisita Imagens", 7);

    private String descricao;
    private int valor;

    private TipoMensagemEnum(String descricao, int valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }
    
    public static TipoMensagemEnum valueOf(Integer codigo){
	for (TipoMensagemEnum tipoMensagemEnum : TipoMensagemEnum.values()) {
	    if(codigo.equals(tipoMensagemEnum.getValor())){
		return tipoMensagemEnum;
	    }
	}
	return null;
    }
    
    
}
