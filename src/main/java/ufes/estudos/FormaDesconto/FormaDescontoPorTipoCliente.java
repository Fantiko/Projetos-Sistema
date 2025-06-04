package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class FormaDescontoPorTipoCliente implements IFormaDescontoTaxaEntrega{
    private Map<String, Double> descontoPorTipoCliente = new HashMap<>();


    public FormaDescontoPorTipoCliente() {
        descontoPorTipoCliente.put("Ouro", 3.0);
        descontoPorTipoCliente.put("Prata", 2.0);
        descontoPorTipoCliente.put("Bronze", 1.0);
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        var tipoCliente = pedido.getCliente().getTipo();

        return new CupomDescontoEntrega("CupomDescontoTipoCliebnte", this.descontoPorTipoCliente.get(tipoCliente));
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        var resp = this.descontoPorTipoCliente.get(pedido.getCliente().getTipo());
        return resp != null;
    }
}
