package br.com.fast.commons.util.enumeration;


/***
 * @author Julio Escobar 
 * 
 * Tipos de falha Osa
 */
public enum TipoFalhaOsaEnum {

	SEM_CONEXAO_VPN ("Sem conexão com a VPN", 1),
	SEM_CONEXAO_SERVICO_MENSAGEM ("Sem conexão com o serviço de mensagens", 2),
	SEM_ACESSO_TOPICO_MENSAGEM ("Sem acesso ao tópico da mensagem", 3),
	MENSAGEM_DESCONHECIDA ("Mensagem desconhecida", 4),
	MENSAGEM_NUMERO_SEQUENCIAL_INDEVIDO ("Mensagem com número sequencial indevido", 5);		

    private String descricao;
    private int valor;

    private TipoFalhaOsaEnum(String descricao, int valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getValor(){
    	return valor;
    }
    
    public static TipoFalhaOsaEnum valueOf(Integer codigo){
	for (TipoFalhaOsaEnum tipoMensagemEnum : TipoFalhaOsaEnum.values()) {
	    if(codigo.equals(tipoMensagemEnum.getValor())){
		return tipoMensagemEnum;
	    }
	}
	return null;
    }
}
