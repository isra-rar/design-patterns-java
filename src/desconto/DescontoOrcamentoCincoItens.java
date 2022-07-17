package desconto;

import imposto.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoCincoItens  extends Desconto {

    public DescontoOrcamentoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
