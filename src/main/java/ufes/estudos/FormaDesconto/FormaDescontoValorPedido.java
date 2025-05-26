package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

public class FormaDescontoValorPedido implements IFormaDescontoTaxaEntrega{
    private double valorLimitePedido;
    private double valorDesconto = 5.0;

    public FormaDescontoValorPedido(double valorLimitePedido) {
        this.valorLimitePedido = valorLimitePedido;
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
