package br.com.fast.commons.util.enumeration;

/***
 * @author Julio Escobar
 *         Enum MotivoNaoConformidadeEnum
 */

public enum MotivoNaoConformidadeEnum {

    OSA_NAO_INFORMADA("OSA não informada."),
    OSA_INVALIDA("OSA Inválida."),
    CONCESSIONARIA_NAO_INFORMADADA("Concessionária não informada."),
    CONCESSIONARIA_INVALIDA("Concessionária Inválida."),
    CONCESSIONARIA_INATIVA("Concessionária Inativa."),
    ULTIMO_SEQ_NAO_INFORMADO("Último sequencial não informado."),
    SEQUENCIAL_INVALIDO_NEGATIVO("Sequencial inválido - negativo"),
    MOMENTO_INICIO_FALHA_NAO_INFORMADO("Momento de início da falha Inválido");

    private String descricao;

    private MotivoNaoConformidadeEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
