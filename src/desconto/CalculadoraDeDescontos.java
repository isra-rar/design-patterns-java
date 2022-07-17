package desconto;

import imposto.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoMaiorQuinhetos(
                new DescontoOrcamentoCincoItens(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
