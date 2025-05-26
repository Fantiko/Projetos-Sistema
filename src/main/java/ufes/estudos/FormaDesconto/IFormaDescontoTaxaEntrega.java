package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

interface IFormaDescontoTaxaEntrega{
    public CupomDescontoEntrega calcularDesconto(Pedido pedido);
    public boolean seAplica(Pedido pedido);
}