package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class FormaDescontoPorTipoCliente implements IFormaDescontoTaxaEntrega{
    private Map<String, Double> DescontoPorTipoCliente = new HashMap<>();


    public FormaDescontoPorTipoCliente(Map<String, Double> descontoPorTipoCliente) {
        DescontoPorTipoCliente = descontoPorTipoCliente;
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
