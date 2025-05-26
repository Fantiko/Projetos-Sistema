package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class FormaDescontoTipoItem implements IFormaDescontoTaxaEntrega{
    private Map<String, Double> descontoPorTipoItem = new HashMap<>();

    public FormaDescontoTipoItem() {
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {

        return null;
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        return false;
    }
}
