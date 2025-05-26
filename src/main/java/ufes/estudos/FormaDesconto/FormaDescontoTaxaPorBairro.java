package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

public class FormaDescontoTaxaPorBairro implements IFormaDescontoTaxaEntrega{
    private String bairroCliente;

    public FormaDescontoTaxaPorBairro(String bairroCliente) {
        this.bairroCliente = bairroCliente;
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
